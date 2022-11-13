package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/medicos")
public class MedicoController {

    private final MedicoRepository medicoRepository;

    public MedicoController(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        medicoRepository.save(new Medico(dados));
    }

    //A anotacao PageableDefault permite definir os parametros de paginação default, caso não seja passado nenhum na url
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 3, page = 0, sort = {"nome", "crm"}) Pageable paginacao) {
        return medicoRepository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados) {
        var medico = medicoRepository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/delete/{id}")
    @Transactional
    public void exclusaoDefinitiva(@PathVariable Long id) {
        medicoRepository.deleteById(id);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void exclusaoLogica(@PathVariable Long id) {
        var medico = medicoRepository.getReferenceById(id);
        medico.inativar();
    }

}

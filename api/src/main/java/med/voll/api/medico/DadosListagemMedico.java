package med.voll.api.medico;

public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade) {

    // na classe temos podemos ter mais de um construtor, porem temos que chamar o construtor principal
    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}

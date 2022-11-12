package med.voll.api.produto;

import jakarta.persistence.EntityManager;

public class ProdutoDao {

    private final EntityManager entityManager;

    public ProdutoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void create(Produto produto) {
        entityManager.persist(produto);
    }

    public Produto read(Long id) {
        return entityManager.find(Produto.class, id);
    }

    public void update(Produto produto) {
        entityManager.merge(produto);
    }

    public void remove(Produto produto) {
        entityManager.remove(produto);
    }

}

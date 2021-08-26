package ecommerce;

public class Cidade extends Estado{
    private Integer id;
    private String nome;

    public Cidade(Integer id, String sigla, String nome, Integer id1, String nome1) {
        super(id, sigla, nome);
        this.id = id1;
        this.nome = nome1;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}

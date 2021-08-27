package ecommerce;

import java.time.LocalTime;
import java.util.List;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private String fotoUrl;
    private LocalTime dataCadastro;
    private LocalTime dataUltimaAtualizacao;
    private Float valorUnitario;
    private Administrador administrador;
    private List<Categoria> categoriaList;
    private List<PromocaoItem> promocaoItemList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public LocalTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public List<PromocaoItem> getPromocaoItemList() {
        return promocaoItemList;
    }

    public void setPromocaoItemList(List<PromocaoItem> promocaoItemList) {
        this.promocaoItemList = promocaoItemList;
    }
}

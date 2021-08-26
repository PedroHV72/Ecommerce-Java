package ecommerce;


import java.time.LocalDate;
import java.time.LocalTime;


public class Endereco extends Cliente {
    private Integer id;
    private String rua;
    private Integer numero;
    private String cep;
    private String complemento;
    private Integer telefone;
    private String bairro;

    public Endereco(Integer id, String nomeCompleto, String email, String senha, LocalDate dataCadastro, LocalTime horaCadastro, LocalDate dataUltimaAtualizacao, String urlFoto, String fotoUrl, String cpf, LocalDate dataNascimento, Cliente.Endereco endereco, Integer idEndereco, String rua, Integer numero, String cep, String complemento, Integer telefone, String bairro) {
        super(id, nomeCompleto, email, senha, dataCadastro, horaCadastro, dataUltimaAtualizacao, urlFoto, fotoUrl, cpf, dataNascimento, endereco);
        this.id = idEndereco;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.telefone = telefone;
        this.bairro = bairro;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}

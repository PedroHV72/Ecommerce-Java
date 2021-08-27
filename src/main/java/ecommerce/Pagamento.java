package ecommerce;

import java.time.LocalTime;

public class Pagamento {
    private Integer id;
    private LocalTime dataCriacao;
    private Boolean excluido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Boolean getExcluido() {
        return excluido;
    }

    public void setExcluido(Boolean excluido) {
        this.excluido = excluido;
    }
}

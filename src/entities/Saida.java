package entities;

import java.util.Date;

public class Saida {

    private Integer id_saida;
    private Integer unidades;
    private Date data_saida;
    private Produto produto;
    private String descricao;

    public Integer getId_saida() {
        return id_saida;
    }

    public void setId_saida(Integer id_saida) {
        this.id_saida = id_saida;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

package com.example.teste;

public class Empresa {
    private String ativo;
    private double lucro;
    private double patrimonio;
    private long acoes;
    private double preco;

    public Empresa(String ativo, double lucro, double patrimonio, long acoes, double preco) {
        this.ativo = ativo;
        this.lucro = lucro;
        this.patrimonio = patrimonio;
        this.acoes = acoes;
        this.preco = preco;
    }

    public String getAtivo() {
        return ativo;
    }

    public double getLucro() {
        return lucro;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public long getAcoes() {
        return acoes;
    }

    public double getPreco() {
        return preco;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public void setAcoes(long acoes) {
        this.acoes = acoes;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

package br.com.dio.projetofinalbiblioteca;

import java.util.List;

public class Usuarios {
    private String nome;
    private double pendencias;
    private int limiteDias, limiteLivros;
    private boolean estado;
    private List<Emprestimos> emprestimo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPendencias() {
        return pendencias;
    }

    public void setPendencias(double pendencias) {
        this.pendencias = pendencias;
    }

    public int getLomiteDias() {
        return limiteDias;
    }

    public void setLomiteDias(int lomiteDias) {
        this.limiteDias = lomiteDias;
    }

    public int getLimiteLivros() {
        return limiteLivros;
    }

    public void setLimiteLivros(int limiteLivros) {
        this.limiteLivros = limiteLivros;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Emprestimos> getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(List<Emprestimos> emprestimo) {
        this.emprestimo = emprestimo;
    }
}

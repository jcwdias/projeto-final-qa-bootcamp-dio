package br.com.dio.projetofinalbiblioteca;

import java.util.Date;

public class Emprestimos {
    private Usuarios usuario;
    private Livros livro;
    private Date dataEmprestimo, daraParaDevolucao, dataDevolucao;
    private int diasAtraso;
    private boolean estado;


    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDaraParaDevolucao() {
        return daraParaDevolucao;
    }

    public void setDaraParaDevolucao(Date daraParaDevolucao) {
        this.daraParaDevolucao = daraParaDevolucao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

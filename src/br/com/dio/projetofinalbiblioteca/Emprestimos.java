package br.com.dio.projetofinalbiblioteca;

import java.text.DateFormat;
import java.util.Date;

public class Emprestimos {
    private Usuarios usuario;
    private Livros livro;
    private DateFormat dataEmprestimo, daraParaDevolucao, dataDevolucao;
    private int diasAtraso;
    private boolean estado;

    public Emprestimos(){

    }

    public void realizaEmprestimo(){

    }

    public void realizaDevolucao(){

    }

    public int calculaAtraso(){
        return 0;
    }

    public double calculaMulta(){
        return 0d;
    }

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

    public DateFormat getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(DateFormat dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public DateFormat getDaraParaDevolucao() {
        return daraParaDevolucao;
    }

    public void setDaraParaDevolucao(DateFormat daraParaDevolucao) {
        this.daraParaDevolucao = daraParaDevolucao;
    }

    public DateFormat getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(DateFormat dataDevolucao) {
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


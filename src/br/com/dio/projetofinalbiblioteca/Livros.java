package br.com.dio.projetofinalbiblioteca;

import java.util.*;

public class Livros {
    private String titulo, genero, resumo, autor;
    private int numPaginas, exemplares, codLivro;


    public Livros(int codLivro, String titulo, String genero, String resumo, String autor, int numPaginas, int exemplares) {
        this.codLivro = codLivro;
        this.titulo = titulo;
        this.genero = genero;
        this.resumo = resumo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.exemplares = exemplares;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    public int getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(int codLivro) {
        this.codLivro = codLivro;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", resumo='" + resumo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                ", exemplares=" + exemplares +
                ", codLivro=" + codLivro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return numPaginas == livros.numPaginas && exemplares == livros.exemplares && titulo.equals(livros.titulo) && genero.equals(livros.genero) && resumo.equals(livros.resumo) && autor.equals(livros.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero, resumo, autor, numPaginas, exemplares);
    }
}

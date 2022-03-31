package br.com.dio.projetofinalbiblioteca;

public class Alunos extends Usuarios{
    private String curso;


    public Alunos(){
        this.setLimiteDias(7);
        this.setLimiteLivros(3);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

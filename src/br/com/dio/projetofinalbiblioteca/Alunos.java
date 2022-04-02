package br.com.dio.projetofinalbiblioteca;

public class Alunos extends Usuarios{
    private String curso;


    public Alunos(){
        this.setLimiteDias(7);
        this.setLimiteLivros(3);
    }


    public void infoUsuarios (){
        System.out.println(this.getNome());
        System.out.println(this.getCurso());
        System.out.println(this.getLimiteDias());
        System.out.println(this.getNumEmprestimos());
        System.out.println(this.getLimiteLivros());
        System.out.println(this.getPendencias());
        this.setEstado(true);
        if(this.isEstado()){
            System.out.println("Usuário bloqueado, consulte a administração!");
        }
        System.out.println("=====================");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "curso='" + curso + '\'' +
                '}';
    }
}

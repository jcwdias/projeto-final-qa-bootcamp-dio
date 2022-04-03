package br.com.dio.projetofinalbiblioteca;

public class Alunos extends Usuarios{
    private String curso;


    public Alunos(){
        this.setLimiteDias(7);
        this.setLimiteLivros(3);
    }


    public void infoUsuarios (){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Curso: "+this.getCurso());
        System.out.println("Limite de dias: "+this.getLimiteDias());
        System.out.println("Numero de empréstimos: "+this.getNumEmprestimos());
        System.out.println("Limite de livros: "+this.getLimiteLivros());
        System.out.println("Pendências: R$"+this.getPendencias());
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

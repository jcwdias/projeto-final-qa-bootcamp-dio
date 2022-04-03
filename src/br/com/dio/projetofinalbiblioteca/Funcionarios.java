package br.com.dio.projetofinalbiblioteca;

public class Funcionarios extends Usuarios{
    private String cargo;


    public Funcionarios(){
        this.setLimiteDias(14);
        this.setLimiteLivros(5);
    }


    public void infoUsuarios (){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Curso: "+this.getCargo());
        System.out.println("Limite de dias: "+this.getLimiteDias());
        System.out.println("Numero de empréstimos: "+this.getNumEmprestimos());
        System.out.println("Limite de livros: "+this.getLimiteLivros());
        System.out.println("Pendências: R$"+this.getPendencias());
        if(this.isEstado()){
            System.out.println("Usuário bloqueado, consulte a administração!");
        }
        System.out.println("=====================");
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "cargo='" + cargo + '\'' +
                '}';
    }
}

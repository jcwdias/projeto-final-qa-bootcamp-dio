package br.com.dio.projetofinalbiblioteca;

public class Funcionarios extends Usuarios{
    private String cargo;


    public Funcionarios(){
        this.setLimiteDias(14);
        this.setLimiteLivros(5);
    }


    public void infoUsuarios (){
        System.out.println(this.getNome());
        System.out.println(this.getCargo());
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

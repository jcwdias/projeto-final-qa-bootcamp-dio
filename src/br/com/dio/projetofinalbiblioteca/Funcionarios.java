package br.com.dio.projetofinalbiblioteca;

public class Funcionarios extends Usuarios{
    private String cargo;


    public Funcionarios(){
        this.setLimiteDias(14);
        this.setLimiteLivros(5);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

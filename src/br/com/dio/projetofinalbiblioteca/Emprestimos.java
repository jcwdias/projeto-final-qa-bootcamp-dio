package br.com.dio.projetofinalbiblioteca;

import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

public class Emprestimos {
    private Usuarios usuario;
    private Livros livro;
    private LocalDate dataEmprestimo, dataParaDevolucao, dataDevolucao;
    private int diasAtraso;
    private double valorMulta;
    private boolean atrasado;

    public Emprestimos(Livros livro, Usuarios usuario){
        Scanner scan = new Scanner(System.in);
        this.usuario = usuario;
        if (usuario.isEstado()){
            System.out.println("Empréstimo não autorizado! ");
            System.out.println("O usuário "+ usuario.getNome() +" possui pendências, consulte a administração!");
        }else if(livro.getExemplares()==0){
            System.out.println("O livro "+ livro.getTitulo() +" não está disponível!");
        }else if(usuario.getNumEmprestimos()==usuario.getLimiteLivros()){
            System.out.println("Empréstimo não autorizado! ");
            System.out.println("O usuário "+ usuario.getNome() +" atingiu o limite de empréstimos, consulte a administração!");
        }else{
            this.livro = livro;
            this.dataEmprestimo = realizaEmprestimo();
            this.dataParaDevolucao = dataEmprestimo.plusDays(usuario.getLimiteDias());
        }

    }

    public LocalDate datas(){
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //System.out.println(formato.format(data));
        return LocalDate.parse(scan.next(),formato);
    }

    public void imprimeInfos (){
        System.out.println("Nome usuário: "+this.getUsuario().getNome());
        System.out.println("Título: "+this.getLivro().getTitulo()+" - "+this.getLivro().getAutor());
        System.out.println("Data do empréstimo: "+this.getDataEmprestimo());
        System.out.println("Prazo de devolução: "+this.getDataParaDevolucao());
        System.out.println("Data de devolução: "+this.getDataDevolucao());
        System.out.println("Dias de atraso: "+this.getDiasAtraso());
        System.out.println("Multa pelo atraso: R$"+this.getValorMulta());
        System.out.println("Em atraso? "+this.isAtrasado());
        System.out.println("==================");
    }

    public LocalDate realizaEmprestimo(){
        System.out.println("Empréstimo do livro : "+ livro.getTitulo()+" de "+livro.getAutor());
        System.out.println("Informe a data do Empréstimo: ");
        dataEmprestimo = datas();
        System.out.println("==================");
        usuario.setNumEmprestimos(usuario.getNumEmprestimos()+1);
        livro.setExemplares(livro.getExemplares()-1);
        return dataEmprestimo;
    }

    public void realizaDevolucao(){
        System.out.println("Devolução do livro : "+ livro.getTitulo()+" de "+livro.getAutor());
        System.out.println("Informe a data de Devolução: ");
        this.dataDevolucao = datas();
        System.out.println("==================");
        this.calculaAtraso();
        this.calculaMulta();
        usuario.setNumEmprestimos(usuario.getNumEmprestimos()-1);
        livro.setExemplares(livro.getExemplares()+1);
    }

    public void calculaAtraso(){
        int dias = 0;
        LocalDate prazoDevolucao = getDataParaDevolucao();
        LocalDate devolucao = getDataDevolucao();
        if (devolucao.compareTo(prazoDevolucao)>0){
            this.atrasado = true;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Period periodo = Period.between(prazoDevolucao, devolucao);
            dias = periodo.getDays();

        }
        this.setDiasAtraso(dias);
    }

    public void calculaMulta(){
        if (atrasado){
            double valorMultaDiaria = 2d;
            this.setValorMulta(valorMultaDiaria*this.getDiasAtraso());
            usuario.setPendencias(valorMulta+usuario.getPendencias());
        }
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

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataParaDevolucao() {
        return dataParaDevolucao;
    }

    public void setDataParaDevolucao(LocalDate dataParaDevolucao) {
        this.dataParaDevolucao = dataParaDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public boolean isAtrasado() {
        return atrasado;
    }

    public void setAtrasado(boolean atrasado) {
        this.atrasado = atrasado;
    }

    @Override
    public String toString() {
        return "Emprestimos{" +
                "usuario=" + usuario +
                ", livro=" + livro +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataParaDevolucao=" + dataParaDevolucao +
                ", dataDevolucao=" + dataDevolucao +
                ", diasAtraso=" + diasAtraso +
                ", valorMulta=" + valorMulta +
                ", atrasado=" + atrasado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emprestimos that = (Emprestimos) o;
        return diasAtraso == that.diasAtraso && Double.compare(that.valorMulta, valorMulta) == 0 && atrasado == that.atrasado && Objects.equals(usuario, that.usuario) && Objects.equals(livro, that.livro) && Objects.equals(dataEmprestimo, that.dataEmprestimo) && Objects.equals(dataParaDevolucao, that.dataParaDevolucao) && Objects.equals(dataDevolucao, that.dataDevolucao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, livro, dataEmprestimo, dataParaDevolucao, dataDevolucao, diasAtraso, valorMulta, atrasado);
    }
}


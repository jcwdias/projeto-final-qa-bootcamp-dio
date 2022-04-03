package br.com.dio.projetofinalbiblioteca;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Criando lista de livros
        List<Livros> livrosCadastrados = new ArrayList<>(List.of()){{
            add(new Livros(1,"Código limpo","Desenvolvimento de Sistemas","Resumo Código limpo","Robert C. Martin",425,2));
            add(new Livros(2,"Lógica de Programação","Desenvolvimento de Sistemas","Resumo Lógica de Programação","Paulo Silveira e Adriano Almeida",214,2));
            add(new Livros(3,"Testes automatizados de software","Desenvolvimento de Sistemas","Resumo Testes automatizados de software","Mauricio Aniche",212,2));
            add(new Livros(4,"Mindset: A nova psicologia do sucesso","Psicologia","Resumo Mindset: A nova psicologia do sucesso","Carol S. Dweck",312,2));
            add(new Livros(5,"Isso é marketing","Marketing","Resumo Isso é marketing","Seth Godin",288,2));
            add(new Livros(6,"Quem pensa enriquece","Política de Trabalho","Resumo Quem pensa enriquece","Napoleon Hill",304,2));
        }};

        for (Livros livros:livrosCadastrados) System.out.println(livros.getTitulo() + " - " + livros.getGenero() + " - " + livros.getResumo() + " - " + livros.getAutor() + " - " + livros.getNumPaginas() + " - " + livros.getExemplares());

        //criando usuários
        Funcionarios tiJean = new Funcionarios();
        tiJean.setNome("Jean");
        tiJean.setCargo("Tecnico em informática");

        Funcionarios profCamila = new Funcionarios();
        profCamila.setNome("Camila");
        profCamila.setCargo("Professora");

        Alunos aluPedro = new Alunos();
        aluPedro.setNome("Pedro");
        aluPedro.setCurso("ADS");

        Alunos aluMaria = new Alunos();
        aluMaria.setNome("Maria");
        aluMaria.setCurso("Pedagogia");

        tiJean.infoUsuarios();


        Emprestimos emprestimo1 = new Emprestimos(livrosCadastrados.get(0),tiJean);
        Emprestimos emprestimo2 = new Emprestimos(livrosCadastrados.get(1),tiJean);

        emprestimo1.realizaDevolucao();
        emprestimo2.realizaDevolucao();
        System.out.println("---------------");
        emprestimo1.imprimeInfos();
        emprestimo2.imprimeInfos();
        tiJean.infoUsuarios();



    }
}

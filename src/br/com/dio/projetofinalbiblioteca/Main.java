package br.com.dio.projetofinalbiblioteca;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Criando lista de livros
        Set<Livros> livrosCadastrados = new HashSet<Livros>(Arrays.asList()){{
            add(new Livros("Código limpo","Desenvolvimento de Sistemas","Resumo Código limpo","Robert C. Martin",425,2));
            add(new Livros("Lógica de Programação","Desenvolvimento de Sistemas","Resumo Lógica de Programação","Paulo Silveira e Adriano Almeida",214,2));
            add(new Livros("Testes automatizados de software","Desenvolvimento de Sistemas","Resumo Testes automatizados de software","Mauricio Aniche",212,2));
            add(new Livros("Mindset: A nova psicologia do sucesso","Psicologia","Resumo Mindset: A nova psicologia do sucesso","Carol S. Dweck",312,2));
            add(new Livros("Isso é marketing","Marketing","Resumo Isso é marketing","Seth Godin",288,2));
            add(new Livros("Quem pensa enriquece","Política de Trabalho","Resumo Quem pensa enriquece","Napoleon Hill",304,2));
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

        System.out.println(tiJean.getNome());
        System.out.println(tiJean.getCargo());
        System.out.println(tiJean.getLimiteDias());
        System.out.println(tiJean.getNumEmprestimos());
        System.out.println(tiJean.getLimiteLivros());
        System.out.println(tiJean.getPendencias());
        tiJean.setEstado(true);
        if(tiJean.isEstado()){
            System.out.println("Usuário bloqueado, consulte a administração!");
        }

        Emprestimos emprestimo1 = new Emprestimos();



    }
}

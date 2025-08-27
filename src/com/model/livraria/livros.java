package com.model.livraria;

import java.util.ArrayList;

public class livros {


    ArrayList<String> livrosDisponiveis = new ArrayList<>();
    usuario infomacoes;

    String LivrosEmprestados;


    public void CadastrasLivros(String livroCadastrar){
        System.out.println("nome do livro que deseja cadastrar: ");
        livrosDisponiveis.add(livroCadastrar);
    }

    public void MostrarLivrosDisponiveis(){
        for (String Confere : livrosDisponiveis){
            System.out.println(Confere);
        }
    }
    public void EmprestarLivros(String Livro, usuario Informacoes){

        if(livrosDisponiveis.contains(Livro)){
            livrosDisponiveis.remove(Livro);
            this.infomacoes = Informacoes;
            this.LivrosEmprestados = Livro;
            System.out.println(" o livro: " + Livro + " foi emprestado para " + infomacoes.name + infomacoes.sobrenome);

        }
            }





}

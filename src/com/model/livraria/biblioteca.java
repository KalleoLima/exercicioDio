package com.model.livraria;

public class biblioteca {
    public static void main(String[] args) {
        livros livros = new livros();
        usuario Usuarios = new usuario("kalleo", "lima");
        emprestimo Emprestimo = new emprestimo();
//livros
livros.CadastrasLivros("superman");
livros.MostrarLivrosDisponiveis();
livros.EmprestarLivros("superman",Usuarios);

System.out.println("informações do emprestimo");
Emprestimo.GuardandoInformacoesDoUsuario(livros,Usuarios);

    }
}

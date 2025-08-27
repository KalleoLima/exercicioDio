package com.model.livraria;

public class emprestimo {
usuario infomacoesUsuarios;
 livros informacoesLivros;



    public   void GuardandoInformacoesDoUsuario(livros infomacoes, usuario infomacoesUsuarios){;
        this.informacoesLivros = infomacoes;
        this.infomacoesUsuarios = infomacoesUsuarios;
        System.out.println("usuario: " + infomacoesUsuarios.name + " esta com o livro: " + informacoesLivros.LivrosEmprestados);


    }


}

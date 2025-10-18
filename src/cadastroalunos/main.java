package cadastroalunos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int opcao = 0;
        CadastroAlunoImpl resposta = new CadastroAlunoImpl();
      Scanner input = new Scanner(System.in);
  while (opcao != 5){
      System.out.println("digite uma opção abaixo cadastrar aluno:   ");
      System.out.println(" digite (1) para cadastrar aluno");
      System.out.println(" digite (2) para remover um aluno");
      System.out.println("digite (3) para buscar aluno");
      System.out.println("digite (4) para ver todos os alunos matriculados");
      System.out.println("digite (5) para sair do sistema");
       opcao = input.nextInt();
       if (opcao == 1){resposta.cadastrarAluno();}
       else if (opcao  == 2){resposta.removerAluno();}
       else if (opcao == 3 ){resposta.buscarAluno();}
       else if (opcao == 4){resposta.mostrarTodosAlunos();}

  }





    }
}

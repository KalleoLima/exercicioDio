package cadastroalunos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CadastroAlunoImpl implements GerenciadorAlunos {
protected int contadorMatricula  = 1;

Scanner input = new Scanner(System.in);
    Map <Integer, String> alunosCadastrados = new HashMap() ;

    @Override
    public String cadastrarAluno() {
        System.out.println("Digite o nome do aluno completo:");
        String nomeAluno = input.nextLine();
        listarAluno(nomeAluno);

    return "";
    }

    @Override
    public String listarAluno(String nome) {

        for (Map.Entry<Integer, String> entry : alunosCadastrados.entrySet()) {
            System.out.println("Nome: " + entry.getValue() + " | Matricula: " + entry.getKey());
        }
        if (alunosCadastrados.isEmpty()){
            alunosCadastrados.put(contadorMatricula,nome);

        }
               else if (alunosCadastrados.containsValue(nome)){
                    System.out.println("já existe aluno com esse nome, tem certeza que deseja continuar? ");
                    String resposta = input.nextLine();
                    if (resposta.equalsIgnoreCase("sim") ){
                        contadorMatricula ++;
                        alunosCadastrados.put(contadorMatricula,nome);
                        System.out.println("cadastrei o mesmo nome, guarde bem a matricula para nao se confundir no futuro");
                    }
               }else {
                contadorMatricula ++;
                alunosCadastrados.put(contadorMatricula,nome);
                System.out.println("cadastrado com sucesso!");
            }
        return "";
    }

    @Override
    public String removerAluno() {
        mostrarTodosAlunos();
        System.out.println(" digite a matricula do aluno que voce quer remover: ");
       Integer  removendoAluno = input.nextInt();
    for (Map.Entry<Integer, String> entry : alunosCadastrados.entrySet() )
      if (alunosCadastrados.containsKey(removendoAluno)){
          alunosCadastrados.remove(removendoAluno);
          System.out.println(" aluno removido com sucesso");
          break;

      }

        return "";
    }

    @Override
    public String buscarAluno( ) {
        String opcao;

            System.out.println("deseja ver todos os alunos? (sim/não)" );
             opcao = input.nextLine();
            if (opcao.equalsIgnoreCase("sim")){
        mostrarTodosAlunos();
            }
        System.out.println("digite o nome inteiro do aluno: ");
        String buscandoNome = input.nextLine();

            if (alunosCadastrados.containsValue(buscandoNome)){
                acharAlunoPorNome(buscandoNome);
                System.out.println("esse aluno esta matriculado!!");

            }

            else {
                System.out.println(" esse aluno nao esta matriculado! ");
            }




        return "";
    }

    @Override
    public String mostrarTodosAlunos() {
        for (Map.Entry<Integer, String> entry:alunosCadastrados.entrySet()){
            System.out.println("nome: " +entry.getValue() + ", numero da matricula: " + entry.getKey());
        }



        return "";
    }



    @Override
    public int acharAlunoPorNome( String nome) {


        int returnMatricula = -1;
        for (Map.Entry<Integer, String> entry:alunosCadastrados.entrySet()){
            if (entry.getValue().equalsIgnoreCase(nome)){
                System.out.println("aluno encontrado: " +entry.getValue() + " matricula: " +entry.getKey());

                returnMatricula = entry.getKey();
                return returnMatricula;
            }
        }

        System.out.println("nao achamos esse aluno! ");





        return returnMatricula;
    }


}




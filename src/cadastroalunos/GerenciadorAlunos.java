package cadastroalunos;

public interface GerenciadorAlunos {
    String cadastrarAluno();

    String listarAluno(String nome);

    String removerAluno();

    String buscarAluno();

    String mostrarTodosAlunos();

    int acharAlunoPorNome( String nome);

}
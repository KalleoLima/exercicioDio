package celular.navegandoNaInternet;

public class atualizandoPagina implements navegadorInternet {
    @Override
    public void ExibirPagina() {
    System.out.println(" exibindo pagina");

    }

    @Override
    public void adicionandoNovaAba() {
        System.out.println("adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina");
    }
}

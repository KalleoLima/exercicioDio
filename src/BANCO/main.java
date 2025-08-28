package BANCO;

public class main {
    public static void main(String[] args) {
        ContaLogica contapp = new Contapoupanca();
        ContaLogica contac = new ContaCorrente();
        contac.name("kalleo");
        contac.depositar(200);
        contac.sacar(100);
        contac.transferir(50, contapp);
        contac.imprimirExtrato();

        System.out.println();
        contapp.name("leo");
        contapp.depositar(100);
        contapp.imprimirExtrato();




    }
}

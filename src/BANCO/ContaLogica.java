package BANCO;

public class ContaLogica implements  IConta{


    protected static  int AGENCIA_PADRAO = 0001;

    protected int agencia = 0001;
    protected int numero = 1000;
    protected double saldo ;
    private String name;


    @Override
    public void sacar(double valor) {
        if (valor > saldo){
            System.out.println(" voce nao tem saldo suficiente para sacar ");
        }
        else {
            System.out.println("saque feito com sucesso!");
            saldo = saldo - valor;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println(" deposito feito com sucesso");

    }

    @Override
    public void transferir(double valor, ContaLogica contabeneficiada) {
        if(valor <= saldo){
        saldo  = saldo -  valor;
        System.out.println(" transferencia feita com sucesso!!");
        }

    }



    @Override
    public void name(String name) {
    this.name = name;
    }


    @Override
    public void imprimirExtrato() {
System.out.printf("olá  %s, ",name);
System.out.printf("seu saldo: %.2f",saldo);

    }


}

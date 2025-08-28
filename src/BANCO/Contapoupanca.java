package BANCO;

public class Contapoupanca extends ContaLogica{



    private static  int SEQUENCIAL = 1;
    private int agencia;

    public void Contapoupanca(){
    super.agencia = AGENCIA_PADRAO;
    super.numero = SEQUENCIAL++ ;

   }



}

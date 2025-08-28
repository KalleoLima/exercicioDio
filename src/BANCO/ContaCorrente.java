package BANCO;

public class ContaCorrente extends ContaLogica{
    private int agencia;
    private static int SEQUECIAL = 1;

   public void ContaCorrente(){
       this.SEQUECIAL = SEQUECIAL++;
      this.agencia = super.AGENCIA_PADRAO;


   }

}

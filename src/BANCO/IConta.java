package BANCO;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, ContaLogica contabeneficiada);
    void imprimirExtrato();
     void name(String name);






}

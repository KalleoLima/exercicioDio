package celular.aparelhoTelefonico;

public class atenderLigacao implements aparelhoTelefonico{
    @Override
    public void ligar() {
    System.out.println("ligando, espere ser atendido!");
    }

    @Override
    public void atender() {
        System.out.println(" atendeu a ligação");

    }

    @Override
    public void iniciarCorreioVoz() {
    System.out.println("iniciado correio de chamada");
    }
}

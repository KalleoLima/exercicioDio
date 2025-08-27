package celular.reprodutorMusical;

public class SelecionarMusica implements ReproduzirMusica {


     private String musicaAtual;

    @Override
    public void play() {
        if(musicaAtual != null){
            System.out.println(" tocando musica: " + musicaAtual);
        }
        else {
            System.out.println("nao tem musica selecionada para dar play");
        }



    }

    @Override
    public void pause() {
        if(musicaAtual == null){
            System.out.println(" nao tem nenhuma musica selecionada para pausar");
        }
        else {
            System.out.println("musica pausada");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;

    }
}

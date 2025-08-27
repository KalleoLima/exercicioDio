package celular.iphone;

import celular.aparelhoTelefonico.aparelhoTelefonico;
import celular.aparelhoTelefonico.atenderLigacao;
import celular.navegandoNaInternet.atualizandoPagina;
import celular.navegandoNaInternet.navegadorInternet;
import celular.reprodutorMusical.SelecionarMusica;

public class iphone {
    public static void main(String[] args) {
        SelecionarMusica Iphone = new SelecionarMusica();
        aparelhoTelefonico IphoneLigacao = new atenderLigacao();
        navegadorInternet IphoneNavegador = new atualizandoPagina();

        System.out.println(" IPHONE LIGAÇÃO");
        IphoneLigacao.ligar();
        IphoneLigacao.atender();
        IphoneLigacao.iniciarCorreioVoz();
        System.out.println();


        System.out.println("SELECIONANDO MUSICA");
        Iphone.selecionarMusica(" 7 years");
        Iphone.play();
        System.out.println();


        System.out.println("APARELHO NAVEGADOR");
        IphoneNavegador.adicionandoNovaAba();
        IphoneNavegador.ExibirPagina();
        IphoneNavegador.atualizarPagina();
    }
}

package Jogo;


public class Main {

    public static void main(String[] args) {

        Jogo jogo = new Jogo();
        
        Background fundo = new Background();
        fundo.gerarBack();

        jogo.historiaInicial();
        jogo.escolherJogador();
        jogo.escolherArma();
        jogo.batalha();
    }
}
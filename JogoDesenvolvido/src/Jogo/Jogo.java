package Jogo;

import Personagens.Personagem;
import Personagens.Terrestre.Soldado;
import Personagens.Terrestre.General;
import Personagens.Mago;
import Personagens.Terrestre.LutSUMO;
import Personagens.Voador.DragaoAlado;

import Arma.Armafisica.Faca;
import Arma.Armamistica.Fogo;
import Arma.Armafisica.Revolver;
import Arma.Armafisica.Fuzil;
import Arma.Armamistica.Magia;
import Arma.Desarmado;
import Arma.Arma;

public class Jogo {

    private Personagem jogador;
    private Arma arma;

    public void historiaInicial() {

        InOut.MsgDeInformacao(
            "Prólogo",
            "No reino de Valóris\numa antiga guerra começou após o despertar de um poderoso Dragão Alado que estava adormecido nas montanhas do norte."
        );

        InOut.MsgDeInformacao(
            "Prólogo",
            "O dragão passou a atacar vilas e castelos utilizando fogo e destruindo tudo por onde passava!"
        );

        InOut.MsgDeInformacao(
            "Início",
            "Vamos iniciar sua jornada e salvar as vilas?"
        );
    }

    public void escolherJogador() {

         int opcao = InOut.leInt(
            "Escolha seu personagem:\n"
            + "1 - Soldado\n"
            + "2 - General\n"
            + "3 - Lutador de Sumô\n"
            
        );
        
        switch (opcao) {

            case 1 -> {
                jogador = new Soldado();

                InOut.MsgDeInformacao(
                        "Personagem",
                        "Você escolheu o Soldado!"
                );
            }

            case 2 -> {
                jogador = new General();

                InOut.MsgDeInformacao(
                        "Personagem",
                        "Você escolheu o General!"
                );
            }

            case 3 -> {
                jogador = new LutSUMO();

                InOut.MsgDeInformacao(
                        "Personagem",
                        "Você escolheu o Lutador de Sumô!"
                );
            }

            default -> InOut.MsgDeInformacao(
                    "Erro",
                    "Opção inválida!"
                );
        }
    }

    public void escolherArma() {

        int opcao = InOut.leInt(
            "Escolha sua arma:\n"
            + "1 - Faca\n"
            + "2 - Revolver\n"
            + "3 - Fuzil\n"
        );

        switch (opcao) {

            case 1:

                arma = new Faca();

                InOut.MsgDeInformacao(
                    "Arma",
                    "Você escolheu a Faca!"
                );
                break;

            case 2:

                arma = new Revolver();

                InOut.MsgDeInformacao(
                    "Revolver",
                    "Você escolheu o Revolver!"
                );
                break;

            case 3:

                arma = new Fuzil();

                InOut.MsgDeInformacao(
                    "Arma",
                    "Você escolheu o Fuzil!"
                );
                break;

            default:

                InOut.MsgDeInformacao(
                    "Erro",
                    "Opção inválida!"
                );
        }
    }
    
 

    public void partida() {

        int vidaJogador = 200;
        int vidaDragao = 250;

        InOut.MsgDeInformacao(
            "Batalha",
            "Vamos começar a batalha!"
        );

        InOut.MsgDeInformacao(
            "Batalha",
            "Você começa com 200 de vida!"
        );

        

        if (vidaJogador <= 0) {

            InOut.MsgDeInformacao(
                "Derrota",
                "O dragão venceu!"
            );
        }
    }
    
    public void batalha(){
        
        int rodadas = 0;
        
        while (vidaJogador > 0 && vidaDragao > 0) {
            
            ++rodadas;
            int chanceErro = (int)(Math.random() * 100);

            

            int ataqueDragao = (int)(Math.random() * 16) + 15;
            vidaJogador -= ataqueDragao;
            
            int ataquePersonagem = (int)(Math.random() * 16) + 15;
            vidaDragao -= ataquePersonagem; 

            InOut.MsgDeInformacao(
                "Dragão",
                "O dragão atacou e tirou "
                + ataqueDragao + " vidas!"
            );

            InOut.MsgDeInformacao(
                "Jogador",
                "Vida restante: " + vidaJogador
            );

            if (vidaJogador == 5) {

                String fugir;

                fugir = InOut.leString(
                    "Você quer fugir e abandonar a batalha? (s/n)"
                );

                if (fugir.equalsIgnoreCase("s")) {

                    InOut.MsgDeInformacao(
                        "Fuga",
                        "Você fugiu da batalha!"
                    );

                    return;
                }

                InOut.MsgDeInformacao(
                    "Troca de arma",
                    "Você chegou a 5 vidas! Escolha outra arma."
                );

                escolherArma();
            }
        }
    }

}
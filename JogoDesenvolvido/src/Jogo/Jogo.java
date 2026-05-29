package Jogo;

import Personagens.Personagem;
import Personagens.Terrestre.Soldado;
import Personagens.Terrestre.General;
import Personagens.Terrestre.Mago;
import Personagens.Terrestre.LutSUMO;
import Personagens.Voador.DragaoAlado;

import Arma.Arma_IF;
import Arma.Faca;
import Arma.Fogo;
import Arma.Revolver;
import Arma.Fuzil;
import Arma.Magia;
import Arma.Desarmado;

public class Jogo {

    private Personagem jogador;
    private Arma_IF arma;
    private int dano;

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
            + "4 - Mago\n"
            + "5 - Dragão Alado"
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

            case 4 -> {
                jogador = new Mago();

                InOut.MsgDeInformacao(
                        "Personagem",
                        "Você escolheu o Mago!"
                );
            }

            case 5 -> {
                jogador = new DragaoAlado();

                InOut.MsgDeInformacao(
                        "Personagem",
                        "Você escolheu o Dragão Alado!"
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
            + "2 - Fogo\n"
            + "3 - Revolver\n"
            + "4 - Fuzil\n"
            + "5 - Magia\n"
            + "6 - Desarmado"
        );

        switch (opcao) {

            case 1:

                arma = new Faca();
                dano = 10;

                InOut.MsgDeInformacao(
                    "Arma",
                    "Você escolheu a Faca!"
                );
                break;

            case 2:

                arma = new Fogo();
                dano = 60;

                InOut.MsgDeInformacao(
                    "Arma",
                    "Você escolheu o Fogo!"
                );
                break;

            case 3:

                arma = new Revolver();
                dano = 100;

                InOut.MsgDeInformacao(
                    "Arma",
                    "Você escolheu o Revolver!"
                );
                break;

            case 4:

                arma = new Fuzil();
                dano = 150;

                InOut.MsgDeInformacao(
                    "Arma",
                    "Você escolheu o Fuzil!"
                );
                break;

            case 5:

                arma = new Magia();
                dano = 20;

                InOut.MsgDeInformacao(
                    "Arma",
                    "Você escolheu a Magia!"
                );
                break;

            case 6:

                arma = new Desarmado();
                dano = 0;

                InOut.MsgDeInformacao(
                    "Arma",
                    "Você ficou desarmado!"
                );
                break;

            default:

                InOut.MsgDeInformacao(
                    "Erro",
                    "Opção inválida!"
                );
        }
    }

    public void batalha() {

        int vidaJogador = 8;
        int vidaDragao = 150;

        InOut.MsgDeInformacao(
            "Batalha",
            "Vamos começar a batalha!"
        );

        InOut.MsgDeInformacao(
            "Batalha",
            "Você começa com 8 vidas!"
        );

        while (vidaJogador > 0 && vidaDragao > 0) {

            

            int chanceErro = (int)(Math.random() * 100);

            if (chanceErro < 20) {

                InOut.MsgDeInformacao(
                    "Erro",
                    "Você errou o ataque!"
                );

            } else {

                arma.usarArma();

                vidaDragao -= dano;

                InOut.MsgDeInformacao(
                    "Ataque",
                    "Você causou " + dano + " de dano!"
                );

                InOut.MsgDeInformacao(
                    "Dragão",
                    "Vida do dragão: " + vidaDragao
                );

                
                if (vidaDragao <= 0) {

                    InOut.MsgDeInformacao(
                        "Vitória",
                        "Você derrotou o dragão!"
                    );

                    return;
                }
            }

            int ataqueDragao = (int)(Math.random() * 3) + 1;

            vidaJogador -= ataqueDragao;

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

        if (vidaJogador <= 0) {

            InOut.MsgDeInformacao(
                "Derrota",
                "O dragão venceu!"
            );
        }
    }

}
package Jogo;

import Personagens.Personagem;
import Personagens.Terrestre.Terrestre;
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

    private Terrestre jogador;
    private Arma arma;
    
    private DragaoAlado dragao = new DragaoAlado();

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
        
        while (jogador.getVida() > 0 && dragao.getVidasDragao() > 0) {
            
            ++rodadas;
            
           
            
            switch(chanceErro) {
                
                //se ele acertar 
                case 1 -> {
                    ataque();
                } 
                
                case 2 -> {
                    
                }
            }
            
            

            if (rodadas == 3) {
                
                
                
            }
        }
    }
    
    public void ataquePersonagem(){
        
         int chanceErroJogador, chanceErroDragao;
         
        //ataque do dragao
        
            chanceErroDragao = (int)(Math.random() * 2) + 1;
            
            switch(chanceErroDragao){
                
                case 1 ->  {
                
                    int ataqueDragao = (int)(Math.random() * 16) + 15;
                       jogador.perderVida(ataqueDragao);
                       
                    InOut.MsgDeInformacao(
                        "Dragão",
                        "O dragão atacou e tirou "
                        + ataqueDragao + " vidas!"
                    );
            
            }
                case 2 -> {
                    
                    InOut.MsgDeInformacao("Errou", "O dragão errou o ataque!!");
                    jogador.correr();
                }
                
            
            }

            
            //ataque do personagem
            
            chanceErroJogador = (int)(Math.random() * 2) + 1;
            
            switch(chanceErroJogador){
                
                case 1 -> {
                    
                    int ataquePersonagem = (int)(Math.random() * 16) + 15;
                    ataquePersonagem = jogador.calcularDano(ataquePersonagem);
                    dragao.perderVida(ataquePersonagem);
                    
                    InOut.MsgDeInformacao("vidas", "Seu ataque foi de " + ataquePersonagem + 
                            "\nVida do dragao:" + dragao.getVidasDragao());
                    
                    InOut.MsgDeInformacao(
                            "Jogador",
                            "Vida restante: " + jogador.getVida()
            );
        

                    }
            
            
                case 2 -> {
                
                InOut.MsgDeInformacao("Errou", "Você errou o ataque!!");
                dragao.voar();
                }
                
    } 
            
    }

}
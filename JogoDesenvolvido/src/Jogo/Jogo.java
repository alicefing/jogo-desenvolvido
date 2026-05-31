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
import Arma.Desarmado;
import Arma.Arma;

public class Jogo {

    private Terrestre jogador;
    private Mago mago = new Mago();
    private DragaoAlado dragao = new DragaoAlado();
    
    boolean renascer = false;
    

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
        
        //set fogo para dragao
        dragao.setArma(new Fogo());

        int opcao = InOut.leInt(
            "Escolha sua arma:\n"
            + "1 - Faca\n"
            + "2 - Revolver\n"
            + "3 - Fuzil\n"
        );

        switch (opcao) {

            case 1:

                jogador.setArma(new Faca());

                InOut.MsgDeInformacao(
                    "Arma",
                    "Você escolheu a Faca!"
                );
                break;

            case 2:

                jogador.setArma(new Revolver());

                InOut.MsgDeInformacao(
                    "Revolver",
                    "Você escolheu o Revolver!"
                );
                break;

            case 3:

                jogador.setArma(new Fuzil());

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

        
        batalha();
    }
    
    public void batalha(){
        
        boolean fim = false;
        
        do{
            
            fim = ataqueDragao();  
            if(fim){
                   break; 
            }
            
            fim = ataquePersonagem();                
                      
        }
        while(!fim);
    }
    
    public boolean ataquePersonagem(){
        
            boolean fim = false;
                
            //ataque do personagem
            
            int chanceErroJogador = (int)(Math.random() * 2) + 1;

            switch(chanceErroJogador){
                
                case 1 -> {
                    
                    int ataquePersonagem = jogador.getArma().usarArma();
                    
                    ataquePersonagem = jogador.calcularDano(ataquePersonagem);
                    dragao.perderVida(ataquePersonagem);
                    
                    if(dragao.getVidasDragao() <= 0){
                        fim = fimPartida();
                        return fim;
                     
                    }
                    else{
                    InOut.MsgDeInformacao("vidas", "Seu ataque foi de " + ataquePersonagem + 
                            "\nVida do dragao:" + dragao.getVidasDragao());                        
                    }
                }
            
                case 2 -> {
                
                dragao.voar();    
                InOut.MsgDeInformacao("Errou", "Você errou o ataque!!\n");
                }
        } 
        return fim;    
            
    }
    
    public boolean ataqueDragao(){
        
        boolean fim = false;
        
        //ataque do dragao
        
           int chanceErroDragao = (int)(Math.random() * 2) + 1;
            
            switch(chanceErroDragao){
                
                case 1 ->  {
                
                       int ataqueDragao = dragao.getArma().usarArma();
                       jogador.perderVida(ataqueDragao);
                       
                       if(jogador.getVida() <= 0){
                        fim = fimPartida();
                        return fim;
                     
                    }
                       else{
                        InOut.MsgDeInformacao(
                            "Dragão",
                            "O dragão atacou e tirou "
                            + ataqueDragao + " vidas!"
                            + "\nSuas vidas: " + jogador.getVida()
                        );   
                       }  
            
            }
                case 2 -> {
                    
                    jogador.correr();                    
                    InOut.MsgDeInformacao("Errou", "O dragão errou o ataque!!");

                }
                
            
            }
            return fim;
    }
    
    public boolean fimPartida() {

    if (jogador.getVida() <= 0) {
        renascer = excecaoMago();
        if(renascer == false){
            InOut.MsgDeInformacao("Fim", "Você foi derrotado");
            return true;
        }
        else{
            return false;
        }

    }if (dragao.getVidasDragao() <= 0) {
        InOut.MsgDeInformacao("Fim", "Você derrotou o Dragão");
        return true;
    }

    return false;
    }
    
    public boolean excecaoMago(){
        
        
        try{ 
            mago.reviver();
            InOut.MsgDeInformacao(
                "Mago",
                "O mago usou sua magia e reviveu você!"
            );

            jogador.setVida(200);
                
            int opcao = InOut.leInt(
                "1 - Continuar com o mesmo personagem\n"
                + "2 - Escolher outro personagem"
            );
            
            if(opcao == 1){
                batalha();
            }

            if (opcao == 2) {
                escolherJogador();
                escolherArma();
            }
            
            return true;

            } catch (MagiaEsgotadaException e) {

                InOut.MsgDeInformacao(
                    "Fim de Jogo",
                    e.getMessage()
                );
                
  
            }
        return false;
        
    }

}

    
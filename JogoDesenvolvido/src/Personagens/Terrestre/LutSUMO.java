/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens.Terrestre;

import Arma.Armafisica.Faca;
import Jogo.InOut;
import Personagens.Habilidades.Fala;

/**
 *
 * @author alicefingiro
 */
public class LutSUMO extends Terrestre implements Fala{
    
    public void desenhar(){
        System.out.println("Desenhando LutSumo");
    };
    
    public void correr(){
        InOut.MsgDeAviso("Run", "O Lutador correu do fogo");
    }
    
    public void falar(){
        System.out.println("Eu sou o Lutador de Sumo");
    }
    
    public void perderVida(int dano) {
        vidaTerrestre -= dano;
    }

    public int getVidaTerrestre() {
        return vidaTerrestre;
    }
    
    
    public int calcularDano(int dano) {

        int danoFinal = dano;

        if (arma instanceof Faca) {
            danoFinal += 15;
        }

        return danoFinal;
    }
}

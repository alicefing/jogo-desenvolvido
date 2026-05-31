/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens.Terrestre;

import Arma.Armafisica.Fuzil;
import Personagens.Habilidades.Fala;

/**
 *
 * @author alicefingiro
 */
public class General extends Terrestre implements Fala{
    
    public void desenhar(){
        System.out.println("Desenhando General");
    };
    
    public void correr(){
        System.out.println("Correndo no chao");
    }
    
    public void falar(){
        System.out.println("Eu sou o General");
    }
    
    public void perderVida(int dano) {
        vidaTerrestre -= dano;
    }

    public int getVidaTerrestre() {
        return vidaTerrestre;
    }
    
    
    public int calcularDano(int dano) {

        int danoFinal = dano;

        if (arma instanceof Fuzil) {
            danoFinal += 15;
        }

        return danoFinal;
    }
    
}

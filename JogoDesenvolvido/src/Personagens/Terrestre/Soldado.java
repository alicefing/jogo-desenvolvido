/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens.Terrestre;


import Arma.Arma;
import Arma.Armafisica.Revolver;
import Personagens.Habilidades.Fala;

 
/**
 *
 * @author alicefingiro
 */
public class Soldado extends Terrestre implements Fala {

    public Arma getArma() {
        return arma;
    }
    
    
    public void desenhar(){
        System.out.println("Desenhando Soldado");
    };
    
    public void correr(){
        System.out.println("Correndo no chao");
    }
    
    public void falar(){
        System.out.println("Eu sou o Soldado");
    }
    
    public void perderVida(int dano) {
        vidaTerrestre -= dano;
    }
    
    public void usarArma(){
        getArma().usarArma();
    }

    public int getVidaTerrestre() {
        return vidaTerrestre;
    }
    
    
    public int calcularDano(int dano) {

        int danoFinal = dano;

        if (arma instanceof Revolver) {
            danoFinal += 15;
        }

        return danoFinal;
    }
}

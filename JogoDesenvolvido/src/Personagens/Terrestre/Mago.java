/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens.Terrestre;

import Personagens.Personagem;
import Personagens.Habilidades.UsaMagia;
import Personagens.Habilidades.Fala;
import Personagens.Voador.VoadorIF;
import Personagens.Terrestre.TerrestreIF;

/**
 *
 * @author alicefingiro
 */
public class Mago extends Personagem implements TerrestreIF, VoadorIF, UsaMagia, Fala{
    
    public void desenhar(){
        System.out.println("Desenhando mago");
                
    }
    
    public void correr(){
        System.out.println("Correndo no chao");
    }

    public void voar(){
        System.out.println("Voando como mago");
    }
    
    public void usarMagia(){
        System.out.println("Lancando magia");
    }
    
    public void falar(){
        System.out.println("Eu sou o Mago");
    }
    
}
    


    

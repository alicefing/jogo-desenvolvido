/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens.Terrestre;

import Personagens.Voador.Voador;
import Personagens.Personagem;
import Personagens.Terrestre.Terrestre;
import Personagens.Habilidades.UsaMagia;

/**
 *
 * @author alicefingiro
 */
public class Mago extends Personagem implements Terrestre, Voador, UsaMagia{
    
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
    
    
}

    

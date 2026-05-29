/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens.Terrestre;

import Personagens.Personagem;
import Personagens.Terrestre.Terrestre;
import Personagens.Habilidades.Fala;

/**
 *
 * @author alicefingiro
 */
public class Soldado extends Personagem implements Terrestre, Fala {
    
    public void desenhar(){
        System.out.println("Desenhando Soldado");
    };
    
    public void correr(){
        System.out.println("Correndo no chao");
    }
    
    public void falar(){
        System.out.println("Eu sou o Soldado");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens.Terrestre;

import Personagens.Personagem;
import Personagens.Habilidades.Fala;
import Personagens.Terrestre.Terrestre;

/**
 *
 * @author alicefingiro
 */
public class LutSUMO extends Terrestre implements Fala{
    
    public void desenhar(){
        System.out.println("Desenhando LutSumo");
    };
    
    public void correr(){
        System.out.println("Correndo no chao");
    }
    
    public void falar(){
        System.out.println("Eu sou o Lutador de Sumo");
    }
}

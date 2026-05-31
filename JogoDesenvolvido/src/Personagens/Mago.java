/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens;

import Personagens.Habilidades.UsaMagia;
import Personagens.Habilidades.Fala;


/**
 *
 * @author alicefingiro
 */
public class Mago extends Personagem implements UsaMagia, Fala{
    
    public void desenhar(){
        System.out.println("Desenhando mago");
                
    }
    
    public void usarMagia(){
        System.out.println("Lancando magia");
    }
    
    public void falar(){
        System.out.println("Eu sou o Mago");
    }
    
    
    
}
    


    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens;

import Personagens.Habilidades.Fala;
import Jogo.MagiaEsgotadaException;


/**
 *
 * @author alicefingiro
 */
public class Mago extends Personagem implements Fala{
    
    private boolean magiaUsada = false;
    
    public void desenhar(){
        System.out.println("Desenhando mago");
                
    }
    
    public void usarMagia(){
        System.out.println("Lancando magia");
    }
    
    public void falar(){
        System.out.println("Eu sou o Mago");
    }
    
    public void reviver() throws MagiaEsgotadaException{ // metodo lancador de exception
        //se ela ja foi usada lanca a exception
        if (magiaUsada){
            throw new MagiaEsgotadaException();
        }
        
        magiaUsada = true;
    }

}
    


    

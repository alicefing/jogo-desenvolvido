/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens;

/**
 *
 * @author alicefingiro
 */
public class Mago extends Personagem implements Corredor, Voador{
    
    public void desenhar(){
        System.out.println("Desenhando mago");
                
    }
    
    public void correr(){
        System.out.println("Correndo no chao");
    }

    @Override
    public void voar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    testeeee acho que deu certo
}

    

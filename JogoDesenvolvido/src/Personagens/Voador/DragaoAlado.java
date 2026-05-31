/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens.Voador;

import Personagens.Personagem;


/**
 *
 * @author alicefingiro
 */
public class DragaoAlado extends Personagem implements VoadorIF{
    
    int vidasDragao = 200;
    
    public void desenhar(){
        System.out.println("Desenhando dragao");
                
    }
    
    public void voar(){
        System.out.println("O dragão voo");
    }
    
    public void perderVida(int dano){
        vidasDragao -= dano;
    }

    public int getVidasDragao() {
        return vidasDragao;
    }
    
        
    
    
}

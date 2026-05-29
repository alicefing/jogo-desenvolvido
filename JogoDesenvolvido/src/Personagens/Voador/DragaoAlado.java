/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens.Voador;

import Personagens.Personagem;
import Personagens.Habilidades.SoltaFogo;


/**
 *
 * @author alicefingiro
 */
public class DragaoAlado extends Personagem implements Voador, SoltaFogo{
    
    public void desenhar(){
        System.out.println("Desenhando dragao");
                
    }
    
    public void voar(){
        System.out.println("Batendo minhas asas");
    }
    
    public void soltarBolaDeFogo(){
        System.out.println("FOGO!");
    }
        
    
}

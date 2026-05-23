/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens;

/**
 *
 * @author alicefingiro
 */
public class General extends Personagem implements Corredor{
    
    public void desenhar(){
        System.out.println("Desenhando General");
    };
    
    public void correr(){
        System.out.println("Correndo no chao");
    }
}

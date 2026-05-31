/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arma.Armamistica;
import Arma.Armamistica.ArmamisticaIF;
import Jogo.InOut;

/**
 *
 * @author alicefingiro
 */
public class Fogo extends ArmamisticaIF {
    
    public Fogo(){
        super("Fogo", 50);
    }
    
    public int usarArma(){
        int ataqueDragao = (int)(Math.random() * 16) + 15;
        InOut.MsgDeInformacao("Ataque", "Bola de fooogo"); 
        
        return ataqueDragao;
                
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arma.Armamistica;
import Arma.Armamistica.Armamistica;
import Jogo.InOut;

/**
 *
 * @author alicefingiro
 */
public class Fogo extends Armamistica {
    
    public Fogo(){
        super("Fogo", 50);
    }
    
    public void usarArma(){
        InOut.MsgDeInformacao("Ataque", "Bola de fooogo");   
                
    }
}

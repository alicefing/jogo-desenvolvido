/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arma.Armafisica;

import Arma.Armafisica.ArmafisicaIF;
import Jogo.InOut;

/**
 *
 * @author alicefingiro
 */
public class Revolver extends ArmafisicaIF {
    
        public Revolver(){
        super("Revolver", 50);
    }
    
    public void usarArma(){
        InOut.MsgDeInformacao("Ataque", "Atirando puf puf");        
    };
}

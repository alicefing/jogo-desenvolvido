
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
public class Fuzil extends ArmafisicaIF {
    
        public Fuzil(){
        super("Fuzil", 50);
    }
    
    public int usarArma(){
        InOut.MsgDeInformacao("Ataque", "Atirando puf puf");  
        int ataquePersonagem = (int)(Math.random() * 16) + 15;
        
        return ataquePersonagem;
    };
}

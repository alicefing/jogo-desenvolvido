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
public class Faca extends ArmafisicaIF  {
 
    public Faca(){
        super("Faca", 50);
    }
    
    public void usarArma(){
        InOut.MsgDeInformacao("Ataque", "Esfaqueando zip zip");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arma;

import Arma.Armafisica.ArmafisicaIF;

/**
 *
 * @author alicefingiro
 */
public class Desarmado extends Arma{
    
    public Desarmado(){
        super("Desarmado", 0);
    }
    
    public void usarArma(){
        System.out.println("Sem arma");        
    };
}

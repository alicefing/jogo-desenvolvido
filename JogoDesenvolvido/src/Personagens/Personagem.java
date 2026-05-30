/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens;
import Arma.Arma;

/**
 *
 * @author alicefingiro
 */
public abstract class Personagem {
    
    protected Arma arma;
    
    public void arma(){
        arma.usarArma();
    }
    
    public void setArma (Arma arma){
        this.arma = arma;
    }
    
    public abstract void desenhar();
  
    
}

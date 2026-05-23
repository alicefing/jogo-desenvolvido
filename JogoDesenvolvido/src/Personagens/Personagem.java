/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens;
import Arma.Arma_IF;

/**
 *
 * @author alicefingiro
 */
public abstract class Personagem {
    
    protected Arma_IF arma;
    
    public void arma(){
        arma.usarArma();
    };
    
    public void setArma (Arma_IF arma){
        this.arma = arma;
    }
    
    public abstract void desenhar();
    
    public void falar(){};
    
    
}

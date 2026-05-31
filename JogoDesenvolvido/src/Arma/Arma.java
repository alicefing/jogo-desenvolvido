/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arma;

/**
 *
 * @author alicefingiro
 */
public abstract class Arma {

   public String nome;
   public int dano; 

    public Arma(String nome, int dano) {
       this.nome = nome;
       this.dano = dano;
    }

    public abstract int usarArma(); 
    
}

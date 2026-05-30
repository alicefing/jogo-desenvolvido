/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arma.Armamistica;

import Arma.Arma;

/**
 *
 * @author kaylane medice
 */
public abstract class ArmamisticaIF extends Arma {
    
    public ArmamisticaIF(String nome, int dano) {
        super(nome, dano);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
    
    
    
}

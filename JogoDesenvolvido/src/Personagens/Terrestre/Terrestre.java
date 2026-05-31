package Personagens.Terrestre;

import Personagens.Personagem;

public abstract class Terrestre extends Personagem {

    protected int vidaTerrestre;

    public Terrestre() {
        this.vidaTerrestre = 50;
    }

    public int getVida() {
        return vidaTerrestre;
    }

    public void setVida(int vida) {
        this.vidaTerrestre = vida;
    }

    public void perderVida(int dano) {
        vidaTerrestre -= dano;
    }

    public abstract void correr();
    
    public abstract int calcularDano(int dano);
}
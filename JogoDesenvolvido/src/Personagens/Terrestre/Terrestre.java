package Personagens.Terrestre;

import Personagens.Personagem;

public abstract class Terrestre extends Personagem {

    protected int vida;

    public Terrestre() {
        this.vida = 5;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void perderVida(int quantidade) {
        vida -= quantidade;
    }

    public abstract void correr();
}
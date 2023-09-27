package pets;

import brinquedos.Brinquedo;
import comidas.Comida;

public abstract class Pet {
    protected final int limiteFome = 10;
    protected final int limiteEnergia = 10;
    protected final int limiteDiversao = 10;

    protected String nome;
    protected int fome;
    protected int energia;
    protected int diversao;

    public Pet(String nome) {
        this.nome = nome;
        this.fome = 5;
        this.diversao = 5;
        this.energia = 5;
    }

    public void brincar(Brinquedo brinquedo) {
        diversao += brinquedo.getNivelDiversao();
        if (diversao > limiteDiversao) {
            diversao = limiteDiversao;
        }

        energia -= brinquedo.getNivelEnergiaGasta();
        if (energia < 0) {
            energia = 0;
        }
    }

    public void alimentar(Comida comida) {
        fome += comida.getCaloria();
        if (fome > limiteFome) {
            fome = limiteFome;
        }
    }

    public void dormir() {
        energia += 5;
        if (energia > limiteEnergia) {
            energia = limiteEnergia;
        }
    }

    public String status() {
        return "fome: " + fome + ", energia: " + energia + ", diversao: " + diversao;
    }

    public abstract void emitirSom();
}

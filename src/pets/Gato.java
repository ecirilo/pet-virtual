package pets;

import brinquedos.Brinquedo;

public class Gato extends Pet {

    private int nivelIndependencia;

    public Gato(String nome) {
        super(nome);
        this.nivelIndependencia = 9;
    }

    public void brincar(Brinquedo brinquedo) {
        diversao += (nivelIndependencia/10) * brinquedo.getNivelDiversao();
        if (diversao > limiteDiversao) {
            diversao = limiteDiversao;
        }

        energia -= (nivelIndependencia/10) * brinquedo.getNivelEnergiaGasta();
        if (energia < 0) {
            energia = 0;
        }
    }

    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }
}

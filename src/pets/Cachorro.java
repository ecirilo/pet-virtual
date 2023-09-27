package pets;

import brinquedos.Brinquedo;

public class Cachorro extends Pet {

    private int nivelExcitabilidade;

    public Cachorro(String nome) {
        super(nome);
        this.nivelExcitabilidade = 8;
    }

    public void brincar(Brinquedo brinquedo) {
        diversao += (1-(nivelExcitabilidade/10)) * brinquedo.getNivelDiversao();
        if (diversao > limiteDiversao) {
            diversao = limiteDiversao;
        }

        energia -= (1-(nivelExcitabilidade/10)) * brinquedo.getNivelEnergiaGasta();
        if (energia < 0) {
            energia = 0;
        }
    }

    public void emitirSom() {
        System.out.println(nome +
                " diz: Au Au!");
    }
}

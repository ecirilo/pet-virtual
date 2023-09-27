package brinquedos;

public class Brinquedo {

    private String nome;
    private int nivelEnergiaGasta;
    private int nivelDiversao;

    public Brinquedo(String nome) {
        this.nome = nome;
        this.nivelEnergiaGasta = 2;
        this.nivelDiversao = 2;
    }

    public int getNivelEnergiaGasta() {
        return this.nivelEnergiaGasta;
    }

    public int getNivelDiversao() {
        return this.nivelDiversao;
    }
}

package comidas;

public class Comida {

    private String nome;
    private int caloria;

    public Comida(String nome) {
        this.nome = nome;
        this.caloria = 1;
    }

    public int getCaloria() {
        return this.caloria;
    }
}

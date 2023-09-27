import brinquedos.Brinquedo;
import pets.Cachorro;
import comidas.Comida;
import pets.Gato;

public class PetVirtual {
    public static void main(String[] args) {
        Brinquedo bola = new Brinquedo("Bola");
        Comida racao = new Comida("Ração");

        Cachorro marcao = new Cachorro("Marcao");
        marcao.alimentar(racao);
        marcao.brincar(bola);

        Gato tom = new Gato("Tom");
        tom.alimentar(racao);
        tom.brincar(bola);

        System.out.println("Status Inicial");
        marcao.status();

        System.out.println("Marcao brinca com a bola");
        marcao.brincar(bola);

        System.out.println("Marcao alimenta de ração");
        marcao.alimentar(racao);

        System.out.println("Marcao dorme um pouco");
        marcao.dormir();

        System.out.println("Status Final");
        marcao.status();
    }
}
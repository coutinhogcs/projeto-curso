import coutinho.guilherme.packged.Cachorro;
import coutinho.guilherme.packged.Gato;

public class Principal {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro();
        cao.somAnimal();
        cao.abanaRabo();


        Gato gato = new Gato();
        gato.somAnimal();
        gato.arranha();
    }
}

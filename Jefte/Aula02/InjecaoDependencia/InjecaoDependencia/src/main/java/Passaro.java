import comportamentos.Respirar;
import comportamentos.Voar;

public class Passaro extends Animal {
    private Voar voar;
    private Respirar respirar;

    public Passaro(String nome, int idade, String categoria, Voar voar, Respirar respirar) {
        super(nome, idade, categoria);

        this.voar = voar;
        this.voar = voar;
    }
}

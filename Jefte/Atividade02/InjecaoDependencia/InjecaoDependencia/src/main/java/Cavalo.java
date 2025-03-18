import comportamentos.Andar;
import comportamentos.Falar;
import comportamentos.Respirar;

public class Cavalo extends Animal {

    private Falar falar;
    private Respirar respirar;
    private Andar andar;

    public Cavalo(String nome, int idade, String categoria, Falar falar, Respirar respirar, Andar andar) {
        super(nome, idade, categoria);

        this.falar = falar;
        this.respirar = respirar;
        this.andar = andar;
    }

    public void falar() {
        this.falar.falar("relinxar");
    }
}

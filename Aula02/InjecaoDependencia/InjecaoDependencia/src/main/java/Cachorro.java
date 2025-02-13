import comportamentos.Andar;
import comportamentos.Falar;
import comportamentos.Respirar;

public class Cachorro extends Animal {
    private Falar falar;
    private Respirar respirar;
    private Andar andar;

    public Cachorro(String nome, int idade, String categoria, Falar falar, Respirar respirar, Andar andar) {
        super(nome, idade, categoria);

        this.falar = falar;
        this.respirar = respirar;
        this.andar = andar;
    }

    public void falar() {
        this.falar.falar("au au");
    }

    public void respirar() {
        this.respirar.respirar(10);
    }

    public void andar() {
        this.andar.andar(10);
    }
}

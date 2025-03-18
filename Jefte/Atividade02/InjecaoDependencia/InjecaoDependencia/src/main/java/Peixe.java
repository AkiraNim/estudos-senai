import comportamentos.Nadar;
import comportamentos.Respirar;

public class Peixe extends Animal {
    private Nadar nadar;
    private Respirar respirar;

    public Peixe(String nome, int idade, String categoria, Nadar nadar, Respirar respirar) {
        super(nome, idade, categoria);

        this.respirar = respirar;
        this.nadar = nadar;
    }

    public void respirar() {
        this.respirar.respirar(10);
    }

    public void nadar() {
        this.nadar.Nadar();
    }
}

import comportamentos.*;

public class Main {
    public static void main(String[] args) {
        Andar andar = new Andar();
        Falar falar = new Falar();
        Nadar nadar = new Nadar();
        Respirar respirar = new Respirar();
        Voar voar = new Voar();

        Cavalo cavalo = new Cavalo ("Juan", 16, "Malandro", falar, respirar, andar);

        cavalo.falar();

        Cachorro cachorro = new Cachorro("Catioro", 3, "Legal", falar, respirar, andar);

        cachorro.falar();
    }
}

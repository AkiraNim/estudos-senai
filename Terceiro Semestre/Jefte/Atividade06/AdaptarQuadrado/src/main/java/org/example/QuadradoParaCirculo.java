package org.example;

public class QuadradoParaCirculo implements FormaGeometrica{

    private final Quadrado quadrado;

    public QuadradoParaCirculo(Quadrado quadrado) {
        this.quadrado = quadrado;
    }


    @Override
    public float getLado() {
        return this.quadrado.getLado();
    }

    @Override
    public float calcularArea() {
        float raio = this.quadrado.getLado()/2;
        float area = raio*raio;
        return (float) (area*Math.PI);
    }
}

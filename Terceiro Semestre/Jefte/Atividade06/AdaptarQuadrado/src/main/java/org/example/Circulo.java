package org.example;

public class Circulo implements FormaGeometrica{
    float lado;

    public Circulo(float lado) {
        this.lado = lado;
    }

    @Override
    public float getLado() {
        return lado;
    }

    @Override
    public float calcularArea() {
        float raio = lado/2;
        float area = raio*raio;
        return (float) (area*Math.PI);
    }
}

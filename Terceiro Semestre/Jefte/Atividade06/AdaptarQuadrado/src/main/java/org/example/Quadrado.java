package org.example;

public class Quadrado implements FormaGeometrica{
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public float getLado() {
        return lado;
    }

    @Override
    public float calcularArea() {
        return lado*lado;

    }
}

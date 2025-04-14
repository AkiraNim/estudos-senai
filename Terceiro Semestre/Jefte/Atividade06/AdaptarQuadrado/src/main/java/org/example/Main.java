package org.example;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2.5F);


        QuadradoParaCirculo quadradoParaCirculo = new QuadradoParaCirculo(quadrado);

        System.out.println("A area do quadrado adaptado para circulo " + quadradoParaCirculo.calcularArea());
    }
}
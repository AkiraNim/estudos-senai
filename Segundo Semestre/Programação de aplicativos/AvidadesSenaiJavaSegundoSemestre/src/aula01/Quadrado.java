/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

/**
 *
 * @author ALUNO
 */
public class Quadrado {
    public int lado;
    public int area;
    
        
        public Quadrado(int lado){
        this.lado=lado;
    }
    
    public int getLado(){
        return lado;
    }
    public void setLado(int lados){
        this.lado = lados;
    }
    public int getArea(){
        return area;
    }
    int areas;
    public int calcularArea(){
        areas=getLado()*getLado();
        return areas;
    }
}

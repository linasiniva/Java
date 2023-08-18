/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.figuras;

/**
 *
 * @author acer
 */
public class Rectangulo {
   //atributos de la clase rectangulo
    private double base;
    private double altura;      
    //método constructor, para crear objtos
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }    
    //métodos get y set   
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }     
    //métodos que retornan un valor. calcular el área o el perímetro
    public double area(){
        double a;
        a=this.base*this.altura;
        return a;
    }
    public double perimetro(){
        double p;
        p=2*this.base+2*this.altura;
        return p;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.figuras;

/**
 *
 * @author acer
 */
public class Circulo {
      //atributos de la clase circulo
    double radio;    
    //método constructor, para crear objtos
    public Circulo(double radio){
        this.radio=radio;
    }    
    //métodos get y set    
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    } 
    //métodos que retornan un valor. calcular el área o el perímetro
    public double area(){
        double a;
        a=Math.PI*Math.pow(this.radio, 2);
        return a;
    }
    public double perimetro(){
        double p;
        p=2*Math.PI*this.radio;
        return p;
    }
}


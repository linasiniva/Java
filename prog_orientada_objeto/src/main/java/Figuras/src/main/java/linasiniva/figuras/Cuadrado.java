/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.figuras;

/**
 *
 * @author acer
 */
public class Cuadrado {
     //atributos de la clase cuadrado DE TIPO PRIVADO 
    private double lado;
    
    //metodo constructr,para crear objetos
    public Cuadrado(double lado){
        this.lado=lado;
    }
    //metodos de consulta get=obener y set=Modificacion 
    public double getlado(){
        return lado;
    }
    public void setlado(double lado){// este atribudo si se envia el parameto  que es el lado 
        this.lado=lado;
    }
    //metodos que retornan un valor .calcular area o el perimetro
    public double area(){
        double a;
        a=Math.pow(this.lado,2);//retorna la base elevada al exponente 2 ejp= lado^2
        //a=this.lado*this.lado; esto hace lo mismo de arriba
        return a;
    }
    public double perimetro(){
        double p;
        p=4*this.lado;
        return p;
    }
    
}
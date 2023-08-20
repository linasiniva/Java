/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.banco;

/**
 *
 * @author acer
 */
//clase hijo con un atributo personal 
//para poder estructor esta clase como clase hija de credito se le coloca "extends " y
//al lado nombre de la clae padre en este caso credito 
public class CreditoPersonal extends Credito{
    //atributos
    
    //método constructor
    public CreditoPersonal(double monto,double interes, int plazo){// en este constructor hereda los atributos de la clase padre osea Credito
        super(monto,interes,plazo);    
    }
    //métodos get set
    
    //métodos que retornan 
    public double calcular_cuota(){
        //double cuota; otra forma de declarar variable 
        //como son atributos privados de la clase padre Credito entonces, 
        //para poder retornar el los objetos de la clase padre en la clase hija.
        //entonces utilizamos  el metodo de consulta "get" asi retorna 
        double cuota=(this.getMonto()+(this.getInteres()*this.getMonto()))/this.getPlazo();
        return cuota;
    }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.banco;

/**
 *
 * @author acer
 */
///clase hijo
//para poder estructor esta clase como clase hija de credito se le coloca "extends " y
//al lado nombre de la clae padre en este caso credito 
public class CreditoEspecial extends Credito {
  //atributos
    
    //métodos constructor
    public CreditoEspecial(double monto,int plazo){
        super(monto,plazo);
    }
           //get y set
    
    //método que retorna
    public double calcular_cuota(){
        double cuota=this.getMonto()/this.getPlazo();//heredado y consultado por medio del metodo get
        return cuota;
    }
}
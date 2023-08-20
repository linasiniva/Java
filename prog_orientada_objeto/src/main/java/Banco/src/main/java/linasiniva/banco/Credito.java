/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.banco;

/**
 *
 * @author acer
 */
//clase padre 
public class Credito {
      //atributos
    private double monto;
    private double interes;
    private int plazo;
    //métodos constructor
    public Credito(){
    }
    //constructor con 3 objetos 
    public Credito(double monto,double interes, int plazo){
        this.monto=monto;
        this.interes=interes;
        this.plazo=plazo;
    }
    //constructor con 2 objetos 
    public Credito(double monto,int plazo){
        this.monto=monto;
        this.plazo=plazo;
    }
    //métodos get y set
    
    public double getMonto(){
        return monto;
    }
    public void setMonto(double monto){
        this.monto=monto;
    }
    
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    
    //métodos que retornan 
}
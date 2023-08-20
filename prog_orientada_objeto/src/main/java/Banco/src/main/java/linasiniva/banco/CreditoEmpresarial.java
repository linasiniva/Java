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
public class CreditoEmpresarial extends Credito {
   //atributos
    private double valor_InteresFijo;//este es el atributo personal unico
    //métodos constructor
    public CreditoEmpresarial(double monto,int plazo,double valor_InteresFijo){
        super(monto,plazo);// en este constructor hereda los 2  atributos de la clase padre osea Credito
        this.valor_InteresFijo=valor_InteresFijo;
    }
    //get y set 

    public double getValor_InteresFijo() {
        return valor_InteresFijo;
    }
    public void setValor_intfijo(double valor_InteresFijo) {
        this.valor_InteresFijo = valor_InteresFijo;
    }
    
//método que retorna
    public double calcular_cuota(){
        double cuota=(this.getMonto()+this.valor_InteresFijo)/this.getPlazo();
        return cuota;
    }   
    
}
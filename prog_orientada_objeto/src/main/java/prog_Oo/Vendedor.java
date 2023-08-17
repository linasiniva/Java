/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_Oo;

/**
 *
 * @author acer
 */
public class Vendedor {
     //declarar variables que tienen los atributos
    private long documento;//variables privadas atributos
    private int tipo;
    private double valorVenta;
    
    //metodo constructor,estos son constructores de objetos 
   
    public Vendedor (){
        
    }
    //constructor de un objeto 
    public Vendedor (long documento){
       this.documento=documento; 
    }
    //constructor de 3 objetos
    public Vendedor (long documento,int tipo,double valorVenta){
        this.documento=documento;
        this.tipo=tipo;
        this.valorVenta=valorVenta;
    }
    
    
    //metodo get y set de los atributos
    public long getDocumento(){
        return documento;
    }
    public void setDocumento(long documento){
        this.documento=documento;  
    }
    //metodos get y set por 

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }
    
    
    
    //metodos o funciones. que retornen resultados el calcular la comision
    public double calcular_comision(){
        double comision=0;
        switch(tipo){
            case 1 :
                comision=valorVenta*25/100;
                break;
            case 2 :
                comision=valorVenta*20/100;
                break;
        }
        return comision;
    }
    //main 1.se mando a prueba pack prog_Oo
   
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_Oo;

/**
 *
 * @author acer
 */
public class vendedores {
  //definir atributos de la clase
    long documento;
    int tipo;
    double valorVenta;
    //constructores, 
    
    //funciones
    public static double calcular_comision(int tipo,double valorVenta){
        //declarar la variable local me sirve para hacer el calculo y retornar el valor
        
        double comision=0;
        if(tipo==1){
            comision=valorVenta*25/100;
        }
        else{
            if(tipo==2){
                comision=valorVenta*20/100;
            }
        }
        return comision;
    }
    //funcion principal
    
 
    
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.programacion_basic_java;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class cicloDoWhile {
    
    /*programa que muestre  el valor de x ,al menos una vez,mientras mientras q x sea menor a 20 
    si x inicia en  1 y se inrementa en uno ¿que pasa ,si incia en en 21? */
    public static void main (String []args ){
         Scanner entrada= new Scanner (System.in);
        int x;
       do{
           System.out.println("ingrese el valor de x");
           x=entrada.nextInt();
           System.out.println("el valor de x : "+x);
           
       }
       while(x<=20);
    }
    
}
    
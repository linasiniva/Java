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
public class cicloFor {
    public static void main (String[]args){
        Scanner entrada= new Scanner (System.in);
        int n=5;
        float notas;
        float promedio;
        float suma=0;
        for(int i=1;i<=n;i++){
            System.out.print("ingrese la nota #"+i);
            notas=entrada.nextFloat();
            suma=suma+notas;
            //System.out.print("suma de notas"+suma);
        }
        promedio=suma/n;
        System.out.print("El promedio de las notas es: "+promedio);
        
    }
    
}

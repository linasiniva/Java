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
public class condicional {
    public static  void main (String []args)
    {
             Scanner entrada= new Scanner (System.in);
        
                System.out.println("ingrese el nombre del estudiante: ");
                String nombre=entrada.nextLine();
                System.out.println("ingrese la nota del estudiante: ");
                double nota=entrada.nextFloat();
                if (nota>2.6){
                    System.out.println("el estudiante "+nombre+" Aprobo ");
                }
                else{
                    System.out.println("el estudiante "+nombre+" Reprobo ");
                }
    }
    
}

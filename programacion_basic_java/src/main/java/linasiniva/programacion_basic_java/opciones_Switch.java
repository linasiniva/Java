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
public class opciones_Switch {
    public static void main (String []args){
        Scanner entrada= new Scanner (System.in);
        
        System.out.println("Bienvenido, ingrese una opcion");
        System.out.println("i para ingresar nombre");
        System.out.println("l para ver lista de nombres");
        System.out.println("s para salir");
        String opc=entrada.nextLine();
        switch (opc){
            case "i":
                System.out.println("ingresar nombre");
                String nombre=entrada.nextLine();
                break;
            case "l":
                System.out.println("lista de nombres");
                break;
            case "s":
                System.out.println("Adios");
                break;
                
        }
    }
    
}

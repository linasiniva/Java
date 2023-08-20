/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.banco;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Simulador {
   public static void main(String[] args){
        //definir los valores,entradas
        Scanner entrada=new Scanner(System.in);
        //atributos                      
        //almacenar los valores
        double monto, interes, valor_InteresFijo,cuota;
        int plazo,seleccion;
        //las opciones del usuario
        
        System.out.println("MENÚ OPCIONES");
        System.out.println("1. Crédito Personal");
        System.out.println("2. Crédito Empresarial");
        System.out.println("3. Crédito Especial");
        System.out.println("Ingrese su opción");
        seleccion=entrada.nextInt();
        switch(seleccion){
            
            case 1:{
                System.out.println("Simulador Crédito Personal");
                System.out.println("Ingrese el monto del Prestamo");
                monto=entrada.nextDouble();
                System.out.println("Ingrese el interes del Prestamo");
                interes=entrada.nextDouble();
                System.out.println("Ingrese el plazo del Prestamo");
                plazo=entrada.nextInt();
                 //crear los objetos
                CreditoPersonal usurio=new CreditoPersonal(monto,interes,plazo);
                 //calcular cuota
                cuota=usurio.calcular_cuota();
                //mostrar resultados
                System.out.println("el valor de la cuota del credito personal es "+cuota);
                break;
            }
            case 2: {
                System.out.println("Simulador Crédito Empresarial");
                System.out.println("Ingrese el monto del Prestamo");
                monto=entrada.nextDouble();
                System.out.println("Ingrese el interes del Prestamo");
                valor_InteresFijo=entrada.nextDouble();
                System.out.println("Ingrese el plazo del Prestamo");
                plazo=entrada.nextInt();
                 //crear los objetos
                CreditoEmpresarial usurio1=new CreditoEmpresarial(monto,plazo,valor_InteresFijo);
                 //calcular cuota
                cuota=usurio1.calcular_cuota();
                //mostrar resultados
                System.out.println("el valor de la cuota del Credito Empresarial es "+cuota);
                break;
            
            }
            case 3: {
                System.out.println("Simulador Crédito Especial");
                System.out.println("Ingrese el monto del Prestamo");
                monto=entrada.nextDouble();
                System.out.println("Ingrese el plazo del Prestamo");
                plazo=entrada.nextInt();
                 //crear los objetos
                CreditoEspecial usurio2=new CreditoEspecial(monto,plazo);
                 //calcular cuota
                cuota=usurio2.calcular_cuota();
                //mostrar resultados
                System.out.println("el valor de la cuota del credito Especial es "+cuota);
            }
        }   
    }
}
    


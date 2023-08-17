/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_Oo;

import java.util.Scanner;
import static prog_Oo.vendedores.calcular_comision;

/**
 *
 * @author acer
 */
public class pruebaVendedores {
  public static void main(String[] args){
        //declaracion de las variables
        long documento ;
        int i=1;
        
        //entrada de los datos.solicitar los datos
        Scanner entrada=new Scanner(System.in);
        //preguntar cuanto vendedores
        System.out.println("escriba 1 para ingrear un venddeor o cualquier para sali");
        int n=entrada.nextInt();
        
        while (n==1){
            //almacenar los datos en las variables locales
            System.out.println("ingrese el numero de dcumento del vendedor #"+i);
            documento=entrada.nextLong();
            System.out.println("ingrese el tipo de vendedor \n1.puerta a puerta\n2.telemercadeo");
            int tipo=entrada.nextInt();
            System.out.println("ingrese el valor de venta");
            double valorVenta=entrada.nextDouble();
            //llamado a las funciones que se necesitan
            double comision=calcular_comision(tipo,valorVenta);
            //mostrar los resultados
            System.out.println("el vendedor \t " +documento);
            System.out.println("comision \t" +comision);
            i++;
            System.out.println("escriba 1 para ingresar un vendedor o cualquier para salir");
            n=entrada.nextInt();
        } 
    } 
}


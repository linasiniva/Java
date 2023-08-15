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
public class cicloWhile {
    public static void main (String []args){
        Scanner entrada= new Scanner (System.in);/*esta linea de codigo le permite al sistema reconocer cual es la variable de enrada */
        int n=10,i=1;/*se declaran las variables tipos entero */
        float valores,promedio,suma=0; /*se declaran las ariales tipo flotante */
        while (i<=n){/*cclo while esta nos permie repetir una accion siempre y cuando la condicion control hasta <=n */
            System.out.println("ingrese el valor #"+i);
            valores = entrada.nextFloat();/*se lee el valor a ingresar el usuario */
            suma=suma+valores;
            i++;/*va aumentando de uno en uno la variable i hasta llegar a 10*/
        }
        promedio=suma/n;/*se realiza la operacion para el promedio */
        System.out.println("la suma de los valores ingresados es :"+suma);/*se imprime en pantalla el resulado*/
        System.out.println("el promedio de los valores ingresados es "+promedio);
        }
    }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package linasiniva.figuras;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Figuras {

         public static void main(String[] args){
        // definir el ingreso de los datos
        Scanner entrada=new Scanner(System.in);
// declarar las variables locales en las que vamos a recibir los datos
        double lado, base, altura, radio, area, perimetro; 
        int seleccion;
// mostrar un menú de opciones para ingresar 1.cuadrados 2. rectángulos 3.círculos 4.salir
        do{
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("1. para Cuadrado");
            System.out.println("2. para Rectángulo");
            System.out.println("3. para Cirulo");
            System.out.println("4. para Salir");
            System.out.println("Ingrese su opción");
            seleccion=entrada.nextInt();
            //crear las instancias de cada tipo de figura
            switch(seleccion){
                case 1:{
                    System.out.println("para crear un cuadro. Ingrese el valor del lado");
                    lado=entrada.nextDouble();
                    Cuadrado cuadro1=new Cuadrado(lado);
                    area=cuadro1.area();
                    perimetro=cuadro1.perimetro();
                    System.out.println("el área del cuadrado es: "+area);
                    System.out.println("el perímetro del cuadrado es: "+perimetro);
                    break;
                }
                case 2:{
                    System.out.println("para crear un Rectangulo. \n Ingrese la base");
                    base=entrada.nextDouble();
                    System.out.println("Ingrese la altura");
                    altura=entrada.nextDouble();
                    Rectangulo rect1=new Rectangulo(base,altura);
                    area=rect1.area();
                    perimetro=rect1.perimetro();
                    System.out.println("el área del Rectangulo es: "+area);
                    System.out.println("el perímetro del Rectangulo es: "+perimetro);
                    
                    break;
                }
                case 3:{
                    System.out.println("para crear un circulo. \n Ingrese el radio");
                    radio=entrada.nextDouble();
                    Circulo cir1=new Circulo(radio);
                    area=cir1.area();
                    perimetro=cir1.perimetro();
                    System.out.println("el area del Circulo es:"+area);
                    System.out.println("el perimetro del Circulo es:"+perimetro);
                }
                case 4:break;    
            }
        }
        while(seleccion==4);
 
    }
}

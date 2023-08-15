/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programarclases;

import linasiniva.prog_orientada_objeto.Estudiante;/*aqui se importa la ruta del pack 
y colocar los atributos publicos para que me pueda correr el programa */

/**
 *
 * @author acer
 */
public class pruebas {
    
      public static void main(String[] args){
        
	/*crear los objetos a partir del constructor, instanciar.estudi1,estudi2 */
        Estudiante estudi1=new Estudiante(1111,"claudia","perez");
        System.out.println("el objeto instancaiado de la clase estudiante es: "+estudi1.nombre+estudi1.apellido);
        
        Estudiante estudi2=new Estudiante("clausp","123abc");/*RECIBE ESTA CLAVE PERO EN PANTALLA ME MUESTRA this.clave="*****";*/
        System.out.println("el objeto instancaiado de la clase estudiante es: "+estudi2.usuario+estudi2.clave);
    }  
    
}

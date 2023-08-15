/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.prog_orientada_objeto;/*ESTO NOS DICE QUE LA INFORMACION QUE SE ESTA MANEJANDO ESTA DENTRO DEL PAQUETE*/
/*PARA HACERLO DESDE OTRO PAQUETE YA SOLO TENDRIA Q
IMPORTAR LA RUTA DEL PAQUETE DONDE SE ENCENTRA LA INFORMACION EJP PACK -PRUEBAS */
/**
 *
 * @author acer
 */
public class ProbarClases {
      public static void main(String[] args){
        
	/*crear los objetos a partir del constructor, instanciar.estudi1,estudi2 */
        Estudiante estudi1=new Estudiante(1111,"claudia","perez");
        System.out.println("el objeto instancaiado de la clase estudiante es: "+estudi1.nombre+estudi1.apellido);
        
        Estudiante estudi2=new Estudiante("clausp","123abc");/*RECIBE ESTA CLAVE PERO EN PANTALLA ME MUESTRA this.clave="*****";*/
        System.out.println("el objeto instancaiado de la clase estudiante es: "+estudi2.usuario+estudi2.clave);
    }  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.prog_orientada_objeto;

/**
 *
 * @author acer
 */
/*clase estudiante con constructores y atributos publicos*/
public class Estudiante {
/*definir los atributos de la clase, DEFINIMOS LOS ATRIBUTOS COMO public PARA PODER COMPARTIRLOS CON OTROS ARCHIVOS*/
    public int id;
    public String nombre, apellido, usuario, clave;
   
 /*creamos el constructor de la clase Estudiante, no debe tener retorno
    por eso no tiene la palabra void por q no devuelve nada*/
    public Estudiante(int id, String nombre, String apellido){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
    }
   
    public Estudiante(String usuario,String clave){
        this.usuario=usuario;
        this.clave="*****";
        System.out.println("usuario autorizado "+usuario);
    }
    
    /*definir los método de la clase*/
    public void acceder(){  }
    public void consultarClase() {}
    public void presentarExamen() {}
    public void consultarNotas() { }
    
    
    
    /* iniciamos la funcion principal */
  // mandamos el main a la clases ProbarClases y desde aya llamamos 
    
    
}

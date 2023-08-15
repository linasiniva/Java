/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.prog_orientada_objeto;

/**
 *
 * @author acer
 */
public class Profesor {
    
     /*atributos*/
    int id, sueldo;
    String nombre, apellido, area, asignatura, institucion, tipo, profesion;
/*constructores*/
    public Profesor(int id, String nombre, String apellido){
        System.out.println("se creó con datos personales ");
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
    }
    
    public Profesor(int id, String area, String asignatura, String tipo){
        System.out.println("se creó con datos de trabajo ");
        this.id=id;
        this.area=area;
        this.asignatura=asignatura;
        this.tipo=tipo;
    }
    
    public Profesor(int id, String institucion, String profesion, int sueldo){
        System.out.println("se creó con datos de financieros ");
        this.id=id;
        this.institucion=institucion;
        this.profesion=profesion;
        this.sueldo=sueldo;
    }
/* métodos*/
public void subirNotas(){}
public void generarAsistencias(){}
public void prepararClase(){}
public void dictarClase(){}
/*main*/

public static void main (String [] args){
    /*Profesor profe1 = new Profesor(1090111222,"juan","Caceres");
    Profesor profe2 = new Profesor(10903331,"Informatica","UNAB");
    Profesor profe3 = new Profesor(19980099,"UNAB","Abogado",1500000);
    Profesor profe4 = new Profesor(19090029,"Carlos","Fuentes");
    Profesor profesor = new Profesor(109032323,"Luis","perez");
           
    System.out.println("el profe " + profe1.id + "nombre:" + profe1.nombre);*/
    
    Estudiante est1=new Estudiante(1090123, "martha", "perez");
    System.out.println("el estudiante de este prof es: "+est1.nombre);
}


}
    


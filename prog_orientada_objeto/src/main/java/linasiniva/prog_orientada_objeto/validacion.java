/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.prog_orientada_objeto;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class validacion {
     /*función que retorna String*/
    public static String acceso(String usuario){
        String saludo="Bienvenido: "+usuario;
        return saludo;
    }
    /*función que retorna String*/
    public static String error(String usuario){
        String error="Acceso denegado: " +usuario + "\nPor favor ingrese un usuario y/o contraseña correctos" ;
        return error;
    }
        /*procedimiento que compara variables y llama las funciones de retorno*/
    public static void verificar(String usuario,String clave){/*funcion verificar */
        String usuarioValido="linasiniva";
        String claveValida="contrasena123";
        if(usuarioValido.equals(usuario) && claveValida.equals(clave)){/*en el condicional utilizamon
            un metodo equals para verificar de que sean iguales los string usuario como clave a lo que se ingresa*/
            System.out.println(acceso(usuario));
        }
        else{ 
            System.out.println(error(usuario));
        }
    }
    /* función principal que llama el procedimento verificar*/
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese su usuario:");
        String usuario=entrada.next();
        System.out.println("ingrese su clave:");
        String clave=entrada.next();
        
        verificar(usuario,clave);
    
    }
    
}

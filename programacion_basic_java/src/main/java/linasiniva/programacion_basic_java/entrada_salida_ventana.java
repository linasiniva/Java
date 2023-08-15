/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linasiniva.programacion_basic_java;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class entrada_salida_ventana {
    
              public static void main (String []args)
        {
            String nombre=JOptionPane.showInputDialog("ingrese por favor su nombre");
            JOptionPane.showMessageDialog(null,"Hola "+nombre);
         }
}

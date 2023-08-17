/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_Oo;

/**
 *
 * @author acer
 */
public class prueba {
    
    public static void main(String[]args){
         
        long d=1090123;
        int t=1;
        double v=50000;
        Vendedor vender1=new Vendedor(d,t,v);//las instancias
        Vendedor vender2=new Vendedor(601212,2,40000);
        
        double comision=vender1.calcular_comision();
        double comision2=vender2.calcular_comision();
        
        System.out.println("documento vendedor 1: "+vender1.getDocumento());
        System.out.println("comision de vendedor 1: "+comision);
        
        System.out.println("documento vendedor 2: "+vender2.getDocumento());
        System.out.println("comision de vendedor 2: "+comision2);
        
    }  
}

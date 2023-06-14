/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

/**
 *
 * @author Hermi
 */
public class tarea6 {
    public void aplicarDescuento(double precioProducto, int numProductos){
        double total;
        if(numProductos>3){
            precioProducto -=5;
            if(numProductos!=0){
                total=precioProducto*0.8;
                System.err.println("Total a pagar es: "+total);
                System.out.println("Enviado");
            }else{
                total=precioProducto*0.95;
                System.out.println("Total a pagar es: "+total);
                System.out.println("Enviado");
            }
        }
    }
}

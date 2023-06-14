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
    //en el precioProducto vale 100
    public void aplicarDescuento(double precioProducto, int numProductos){
        double total;
         final double precioPro = precioProducto -=5; //ese precioProducto vale ahora 95 porque resta -5
         
        //ese numProducto vale 5
        if(numProductos>3){
            //refactorización de extracción de constante para eliminar números mágicos
            final boolean numero = numProductos!=0;
              //ese cero y el 3 son numeros magicos
            if(numero){               
                total=calculardescuento(precioProducto);
                System.err.println("Total a pagar es: "+total);
                System.out.println("Enviado");
            }else{
                total=calcullardescuento(precioProducto);
                System.out.println("Total a pagar es: "+total);
                System.out.println("Enviado");
            }
        }
    }

    public double calcullardescuento(double precioProducto) {
        double total;
        //cuando hace uso de esta condicion
        total=precioProducto*0.95;
        return total;
    }

    public double calculardescuento(double precioProducto) {
        double total;
        //diferente de cero
        total=precioProducto*0.8;
        return total;
    }
 
}

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
import java.util.*;
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner cn=new Scanner(System.in);
        tarea6 miCarrito=new tarea6();
        double precio=0;
        int cantidad=0;
        System.out.println("Ingrese Precio Producto: ");
        precio=cn.nextDouble();
        System.out.println("Ingrese Cantidad: ");
        cantidad=cn.nextInt();
       // miCarrito.calcularDescuento(precio, cantidad);
        
    }
    
}

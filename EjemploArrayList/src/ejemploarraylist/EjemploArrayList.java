/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Factura factura = new Factura();
        
        Producto p1 = new Producto("gaseosa",1000);
        Producto p2 = new Producto("Papas",1000);
                
        factura.adicionarProducto(p1);
        factura.adicionarProducto(p2);
        
        ArrayList<Producto> lista = factura.listarProducto();
        for (int i = 0; i < lista.size() ; i++) {
            Producto p = lista.get(i);
            System.out.println(p.getNombre()+" "+p.getPrecio());
            
        }
        
        
        
    }
    
}

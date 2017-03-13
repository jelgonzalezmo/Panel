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
public class Factura {
    private ArrayList<Producto> productos;
    public Factura(){
        this.productos = new ArrayList<>();
    }
    public void adicionarProducto (Producto producto){
        this.productos.add(producto);
        }
    public ArrayList<Producto> listarProducto(){
        return this.productos;
    }
    public double calcularTotal(){
        double total = 0;
        for (Producto producto : productos){
            total += producto.getPrecio();
                }
        return total;
    }

    
}

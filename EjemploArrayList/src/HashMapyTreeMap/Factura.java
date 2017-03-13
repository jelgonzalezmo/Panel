/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMapyTreeMap;

import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Estudiante
 */
public class Factura {

    private TreeMap<String, Producto> productos;

    public Factura() {
        this.productos = new TreeMap<>();
    }

    public void adicionarProducto(Producto producto) {
        this.productos.put(producto.getNombre(), producto);
    }

    public TreeMap<String, Producto> listarProducto() {
        return this.productos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos.values()) {
            total += producto.getPrecio();
        }
        return total;
    }
}

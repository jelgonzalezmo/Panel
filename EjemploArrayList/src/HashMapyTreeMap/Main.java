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
public class Main {

    public static void main(String[] args) {
        Factura factura = new Factura();

        Producto p1 = new Producto("Gaseosa", 1000);
        Producto p2 = new Producto("Papas", 1000);
        Producto p3 = new Producto("Aguacates", 1800);

        factura.adicionarProducto(p1);
        factura.adicionarProducto(p2);
        factura.adicionarProducto(p3);

        TreeMap<String, Producto> lista = factura.listarProducto();
        for (String clave : lista.keySet()) {
            Producto p = lista.get(clave);
            System.out.println(p.getNombre() + " " + p.getPrecio());
        }

        /*este de abajo es el mismo de arriba pero escrito diferente
        
        for (Producto p : lista.values()) {
            System.out.println(p.getNombre() + " " + p.getPrecio());
        
         */
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Paneles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre=JOptionPane.showInputDialog(null, "cual es tu nombre: ");
       int Choice=JOptionPane.showConfirmDialog(null, "Te gusta Programacion?"+" "+nombre);
       if(Choice==JOptionPane.YES_OPTION){
          JOptionPane.showMessageDialog(null, "que bueno ");
       }
       else{
          JOptionPane.showMessageDialog(null, "que mal ");
       }
    }
    
}

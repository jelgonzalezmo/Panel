/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFRAME;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class MainEventos {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400, 320));
        frame.setTitle("Ventana");
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("tipo de codigo");
        JTextField field = new JTextField(5);
        JButton button = new JButton("seguro?");
        button.setIcon(new ImageIcon("Icono.gif"));
        button.addActionListener(new Eventos(field));
        Eventos eventos=new Eventos(field);
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(field);
        frame.add(button);
        frame.pack();
        
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dimension.width / 2 - frame.getSize().width / 2, dimension.height / 2 - frame.getSize().height / 2);
        frame.setVisible(true);
    }
}

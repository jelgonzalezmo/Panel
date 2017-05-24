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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Image Icono = Toolkit.getDefaultToolkit().getImage("Icono.gif");
        frame.setIconImage(Icono);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setBackground(Color.GREEN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 120));
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dimension.width / 2 - frame.getSize().width / 2, dimension.height / 2 - frame.getSize().height / 2);
        frame.setTitle("Holaaa");
        frame.setLayout(new FlowLayout());
        
        JTextField field=new JTextField(5);
        frame.add(field);
        
        JButton boton1 = new JButton();
        boton1.setText("presionar");
        boton1.setBackground(Color.blue);
        frame.add(boton1);
             
        JButton boton2 = new JButton();
        boton2.setText("presioname tambien");
        boton2.setBackground(Color.blue);
        frame.add(boton2);
        frame.setVisible(true);

    }
}

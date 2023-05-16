/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3_buclesycondicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE SANDOVAL
 */
public class ej2BUCL {

    public static void main(String[] args) {
        
        try{

        int numC = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa cantidad de numeros a digitar"));

        for (int i = 0; i < numC; i++) {

            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa numero"));

            if (num > 0) {
                JOptionPane.showMessageDialog(null, "el numero es mayor a 0");

            }
            if (num < 0) {
                JOptionPane.showMessageDialog(null, "el numero es menor a 0");

            }
            if (num == 0) {
                JOptionPane.showMessageDialog(null, "el numero es igual a 0");
            }

        }

        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

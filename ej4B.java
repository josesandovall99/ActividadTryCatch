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
public class ej4B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try{
        String cadena = JOptionPane.showInputDialog(null, "INGRESE PALABRA");
        boolean may = false;
        boolean min = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                may = true;
            } else {
                min = true;
            }
        }
        if (may == true && min == true) {
            JOptionPane.showMessageDialog(null, "la palabra esta en mayusculas y minusculas");
            may=false;
                    min=false;

        }
        if (may == true) {
            JOptionPane.showMessageDialog(null, "la palabra esta en mayuscula");

        }
        if (min == true) {
            JOptionPane.showMessageDialog(null, "la palabra esta en minusculas");

        }
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

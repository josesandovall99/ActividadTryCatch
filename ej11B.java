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
public class ej11B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{

        int AL = Integer.parseInt(JOptionPane.showInputDialog(null, "CANTIDAD DE ALUMNOS"));
        int PAGOA;
        int PAGOC;

        if (AL >= 100) {

            PAGOA = 65;
            PAGOC = PAGOA * AL;
            JOptionPane.showMessageDialog(null, "CADA ALUMNO DEBE PAGAR " + PAGOA + " Y SE DEBEN PAGAR " + PAGOC + " A LA COMPANIA DE AUTOBUSES");

        }if (AL >= 50 && AL<=99) {

            PAGOA = 70;
            PAGOC = PAGOA * AL;
            JOptionPane.showMessageDialog(null, "CADA ALUMNO DEBE PAGAR " + PAGOA + " Y SE DEBEN PAGAR " + PAGOC + " A LA COMPANIA DE AUTOBUSES");

        }if (AL >= 30 && AL<=49) {

            PAGOA = 95;
            PAGOC = PAGOA * AL;
            JOptionPane.showMessageDialog(null, "CADA ALUMNO DEBE PAGAR " + PAGOA + " Y SE DEBEN PAGAR " + PAGOC + " A LA COMPANIA DE AUTOBUSES");

        }if (AL < 30) {

            PAGOC = 4000;
            PAGOA = PAGOC/AL;
            
            JOptionPane.showMessageDialog(null, "CADA ALUMNO DEBE PAGAR " + PAGOA + " Y SE DEBEN PAGAR " + PAGOC + " A LA COMPANIA DE AUTOBUSES");

        }
} catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

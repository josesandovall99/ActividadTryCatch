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
public class ej3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try{
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite numero"));

        if (num2 == 0) {
            System.out.println("ERROR");

        } else {
            System.out.println("la division es " + num1 / num2);
        }
} catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

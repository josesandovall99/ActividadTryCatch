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
public class ej1BLUC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{

        int numR = (int) (Math.random() * 100);

        for (int i = 0; i < 10; i++) {

            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "adivina el numero ALEATORIO (1-100)"));

            if (num >= 0 && num <= 100) {

                if (numR == num) {

                    JOptionPane.showMessageDialog(null, "el numero ingresado es CORRECTO \n NUMERO DE INTENTOS: " + i
                    );
                    break;
                }
                if (num > numR) {

                    JOptionPane.showMessageDialog(null, "el numero a adivinar es MENOR");

                }
                if (num < numR) {
                    JOptionPane.showMessageDialog(null, "el numero a adivinar es MAYOR");
                }

            } else {
                JOptionPane.showMessageDialog(null, "NUMERO NO ACEPTADO");
                break;
            }

        }
} catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

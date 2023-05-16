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
public class ej4BUCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE NUMERO 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE NUMERO 2"));

        if (num1 > num2) {

            int aux = num1;
            num1 = num2;
            num2 = aux;

        }
        System.out.println("NUMEROS PARES ENTRE LOS DOS NUMEROS");
        for (int i = num1; i < num2; i++) {

            if (i % 2 == 0) {
                System.out.print("(" +i+ ")");
            }
        }
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

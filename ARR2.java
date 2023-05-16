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
public class ARR2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
        int[] num = new int [10]; 
        
        for (int i = 0; i < 10; i++) {
            num [i]= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero "+ (i+1) ));
            
        }
        
        for (int i = 0; i < num.length - 1; i++) {// METODO BURBUJA
            for (int j = 0; j < num.length - 1; j++) {

                if (num[j] > num[j + 1]) {

                    int aux = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = aux;

                }

            }
            
            

        }
        
        System.out.println("NUMEROS: ");
            for (int j = 0; j < 10; j++) {
                System.out.print("("+num[j]+")");
            }
            System.out.println();
            System.out.println("EL MINIMO ES " + num[0] + " Y EL MAXIMO ES: " + num[9]);
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

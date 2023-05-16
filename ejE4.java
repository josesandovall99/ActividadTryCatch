/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE SANDOVAL
 */
public class ejE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        int a = (Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE NUMERO")));
        int b = (Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE NUMERO")));
        int mult = a*b;
        int suma = a+b;
        int division = a/b;
        int res = a-b;
        
        System.out.println("suma: " + suma + " // resta: " + res + "// division: " + division + " // multiplicacion: " + mult);
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
        
    }
    
}

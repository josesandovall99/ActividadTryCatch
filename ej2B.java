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
public class ej2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        
        
        
               int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite numero"));
               
               if (num1 % 2 ==0) {
                   
                   System.out.println("el numero es par");
            
        }else{System.out.println("el numero es impar");}
} catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

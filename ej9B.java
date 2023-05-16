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
public class ej9B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        
        int A = Integer.parseInt(JOptionPane.showInputDialog(null, "digite año"));
        
        if ((A % 4 == 0))
	System.out.println("El año es bisiesto");
else
	System.out.println("El año no es bisiesto");
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

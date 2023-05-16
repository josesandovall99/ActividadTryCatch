/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.taller1p2;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE SANDOVAL
 */
public class punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{

        String OR = JOptionPane.showInputDialog(null, "DIGITA ORACION");
        
        String[] cadena = OR.split("\\s+");
        
        int cantidadPalabras = cadena.length;
        

        JOptionPane.showMessageDialog(null, "N DE PALABRAS: " + cantidadPalabras);
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }

    }
    
}

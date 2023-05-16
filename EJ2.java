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
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        
        double bas= (Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE BASE")));
        double are= 0;
        double al= (Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE ALTURA")));
        double per= 0;
        
        are = bas*al;
        per= 2*(bas + al);
        
        JOptionPane.showMessageDialog(null, "EL AREA ES: " + are);
                JOptionPane.showMessageDialog(null, "EL PERIMETRO ES: " + per);

        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
        
    }
    
}

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
public class ej13B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        
        int da = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE RESULTADO DE DADO: "));
        if (da == 1 || da==2 || da==3 || da==4 || da==5 || da==6 ) {
            
        
        if (da == 1) {
            
            JOptionPane.showMessageDialog(null, "LA CARA OPUESTA ES: SEIS ");
            
        }if (da == 2) {
            
            JOptionPane.showMessageDialog(null, "LA CARA OPUESTA ES: CINCO ");
            
        }if (da == 3) {
            
            JOptionPane.showMessageDialog(null, "LA CARA OPUESTA ES: CUATRO ");
            
        }if (da == 4) {
            
            JOptionPane.showMessageDialog(null, "LA CARA OPUESTA ES: TRES ");
            
        }if (da == 5) {
            
            JOptionPane.showMessageDialog(null, "LA CARA OPUESTA ES: DOS ");
            
        }if (da == 6) {
            
            JOptionPane.showMessageDialog(null, "LA CARA OPUESTA ES: UNO ");
            
        }
     
        
        }else{JOptionPane.showMessageDialog(null, "ERROR numero incorrecto");}
        
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

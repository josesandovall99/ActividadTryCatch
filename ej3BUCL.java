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
public class ej3BUCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        
        while(true){
        
        char let = JOptionPane.showInputDialog(null, "ingresa letra").charAt(0);
        
            if (let == ' ') {
                break;
                
            }
            if (let=='a' || let=='e' ||let=='i' ||let=='o' ||let=='u' ||let=='A' || let=='E' ||let=='I' ||let=='O' ||let=='U') {
                
                JOptionPane.showMessageDialog(null, "la letra " + let + " es VOCAL");
                
            }else{JOptionPane.showMessageDialog(null, "la letra " + let + " no es VOCAL");}
            
            
        
        
        }
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

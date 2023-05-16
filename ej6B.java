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
public class ej6B {

    
    public static void main(String[] args) {
        
        try{
        
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "digite su edad"));
        char sex = JOptionPane.showInputDialog(null, "digite su sexo \n m = hombre \n f = mujer").charAt(0);
        double not = Double.parseDouble(JOptionPane.showInputDialog(null, "digite su nota"));
        
        if (not >= 5 && sex =='m' && edad >= 18) {
            
            System.out.println("POSIBLE ACEPTACION");
            
            
        }if (not >= 5 && sex =='f' && edad >= 18) {
            
            System.out.println("ACEPTADA");
            
        }else{System.out.println("NO ACEPTADO/A");}
        
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
        
        
    }
    
}

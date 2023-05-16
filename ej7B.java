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
public class ej7B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        
        double x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite x1"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite y1"));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite x2"));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite y2"));
        double r1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite r1"));
        double r2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite r2"));
        
        double d = Math.sqrt((Math.pow(x2-x1, 2))+ (Math.pow(y2-y1, 2)));
        
        if (d>r1+r2) {
            
            JOptionPane.showMessageDialog(null, "las circunferencias son EXTERIORES");
            
        }if (d==r1+r2) {
            
            JOptionPane.showMessageDialog(null, "las circunferencias son TANGENTES EXTERIORES");
            
        }if (d<r1+r2) {
            
            JOptionPane.showMessageDialog(null, "las circunferencias son SECANTES");
            
        }if (d== r1-r2) {
            
            JOptionPane.showMessageDialog(null, "las circunferencias son TENGENTES INTERIORES");
            
        }if (d<r1-r2) {
            
            JOptionPane.showMessageDialog(null, "las circunferencias son INTERIORES");
            
        }if (d==0) {
            
            JOptionPane.showMessageDialog(null, "las circunferencias son CONCENTRICAS");
            
        }
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

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
public class ej6BUCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        int bas = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE BASE"));
        int exp = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EXPONENTE"));
        if (exp<0) {
            exp=exp*(-1);
        }
        int res=bas;
        
        for (int i = 0; i < exp-1; i++) {
            
            res = res*bas;
            
            
        }
        System.out.println(bas+" a la "+exp+" ES: " + res);

        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

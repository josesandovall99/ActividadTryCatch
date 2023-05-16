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
public class ARR1 {

    public static void main(String[] args) {
        
        try{
        int[] num = new int [10]; 
        
        for (int i = 0; i < 10; i++) {
            num [i]= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));
            
        }
        
        for (int i = 9; i >= 0; i--) {
            System.out.println(num[i]);
        }
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

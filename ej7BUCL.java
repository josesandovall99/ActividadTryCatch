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
public class ej7BUCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "CANTIDAD DE MESES PARA PAGAR"));
        int pago=10;
        int j=1;
        
        for (int i = 1; i <= mes; i++) {
            
            System.out.println("EN EL "+i+" MES SE PAGO: " + pago*j);
            j*=2;
        }
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

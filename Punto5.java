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
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
                int pir = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE NUMERO DEL TRIANGULO"));
                int cont = 1;
                int cont2=1;
                int cont3=1;
                
                
                for (int i = 0; i < pir; i++) {
                    
                    cont2 = 1;
                    cont3=cont;
                    
                    for (int j = 0; j < pir-cont; j++) {
                        
                    }
                    for (int j = 0; j < pir-(pir-cont); j++) {
                        
                        System.out.print("+");                        cont2++;
                    }
                    for (int j = 0; j < pir-(pir-(cont-1)); j++) {
                        
                        
                        System.out.print("+");
                        cont3--;
                    }
                    System.out.println();
                    cont++;
        }

        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

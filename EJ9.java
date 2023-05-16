/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
       Scanner leer = new Scanner (System.in);
        System.out.println("digite precio de compra: ");
        double  comp = leer.nextDouble();
        
        double prec = comp - (comp*0.15);
        
        System.out.println("el precio es: "+ prec);
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

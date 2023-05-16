/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
       Scanner leer = new Scanner (System.in);
       
        System.out.println("digite numero: ");
        double num = leer.nextDouble();
        
        double raizC = Math.sqrt(num);
        double raizCu = Math.cbrt(num);
        
        System.out.println("la raiz cuadrada del numero es: " +raizC + " y la cubica es: " + raizCu);
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

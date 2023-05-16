/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
       Scanner leer = new Scanner (System.in);
        System.out.println("digite calificacion de previo 1: ");
        double prev1= leer.nextDouble();
        System.out.println("digite calificacion de previo 2: ");
        double prev2= leer.nextDouble();
        System.out.println("digite calificacion de previo 3: ");
        double prev3= leer.nextDouble();
        System.out.println("digite calificacion de Examen Final: ");
        double ex= leer.nextDouble();
        System.out.println("digite calificacion de Trabajo Final: ");
        double trab= leer.nextDouble();
        
        double parciales = ((prev1 + prev2 + prev3)/3)*0.55;
        double exF= ex*0.30;
        double trabF= trab*0.15;
        double def=parciales+exF+trabF;
        
        System.out.println("la definitiva es: " + def);
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

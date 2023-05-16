/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
       Scanner leer = new Scanner (System.in);
       
        System.out.println("digite minutos: ");
        double min= leer.nextDouble();
        
        double hor = min/60;
        
        System.out.println("en horas es: " + hor);
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
       Scanner leer = new Scanner (System.in);
        System.out.println("digite x1: ");
        double x1 = leer.nextDouble();
        System.out.println("digite y1: ");
        double y1 = leer.nextDouble();
        System.out.println("digite x2: ");
        double x2 = leer.nextDouble();
        System.out.println("digite y2: ");
        double y2 = leer.nextDouble();
        
        double dist = Math.sqrt((Math.pow(x2-x1, 2))+ (Math.pow(y2-y1, 2)));
        
        System.out.println("la distancia es: " +dist);
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

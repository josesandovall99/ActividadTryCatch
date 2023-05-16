/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
      Scanner leer = new Scanner (System.in);
      
        System.out.println("digite numero 1: ");
        int num1= leer.nextInt();
        System.out.println("digite numero2");
        int num2 = leer.nextInt();
        
        int dist = num1-num2;
        if (dist<0) {
            dist = dist*(-1);
        }
        System.out.println("la distancia entre los dos numeros es: " + dist);
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

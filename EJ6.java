/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;
public class EJ6 {

    
    public static void main(String[] args) {
        
        try{
        Scanner leer = new Scanner (System.in);
        
        System.out.println("digite numero 1: ");
        int num1 = leer.nextInt();
        System.out.println("digite numero 2: ");
        int num2 = leer.nextInt();
        System.out.println("digite numero 3: ");
        int num3 = leer.nextInt();
        
        int media = (num1 + num2 + num3)/2;
        
        System.out.println("la media es: " + media);
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

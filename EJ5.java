/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;
public class EJ5 {

   
    public static void main(String[] args) {
        
        try{
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese temperatura en Fahrenheit: ");
        double tem1 = leer.nextDouble();
        double tem2 = (tem1 - 32)/1.8;
        
        System.out.println("la tempratura en celsius es: " + tem2);
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;
public class EJ3 {

    
    public static void main(String[] args) {
        
        try{
        
        Scanner leer = new Scanner(System.in);
        System.out.println("digite cateto opuesto: ");
        double catetoO = leer.nextDouble();
        System.out.println("digite cateto adyacente: ");
        double catetoA = leer.nextDouble();
        
        double hip = Math.sqrt(Math.pow(catetoA,2)+Math.pow(catetoO, 2));
        
        System.out.println("la hipotenusa es; " + hip);
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

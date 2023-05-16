/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
       Scanner leer = new Scanner (System.in);
       
        System.out.println("digite sueldo base: ");
        double base = leer.nextDouble();
        double com = base*0.10;
        double baseCom = (com)+ base;
        System.out.println("dinero obtenido por 3 ventas en el mes: " + ((com*3)+base));
        System.out.println("sueldo base: " +base );
        System.out.println("comisiones: " + com*3);
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

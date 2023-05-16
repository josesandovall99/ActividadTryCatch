/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ20 {

   
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner (System.in);
        
        System.out.println("cuantas monedas de 2 euros tienes? ");
        int mon2 = leer.nextInt();
        System.out.println("cuantas monedas de 1 euros tienes? ");
        int mon1 = leer.nextInt();
        System.out.println("cuantas monedas de 50 centimos tienes? ");
        int mon50 = leer.nextInt();
        System.out.println("cuantas monedas de 20 centimos tienes? ");
        int mon20 = leer.nextInt();
        System.out.println("cuantas monedas de 10 centimos tienes? ");
        int mon10 = leer.nextInt();
        
        System.out.println("TIENES "+(mon2*2+mon1*1)+ " EUROS Y "+(mon50*50+mon20*20+mon10*10)+" CENTIMOS.");
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

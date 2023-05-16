/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        System.out.println("digite numero 1:");
        int num1 = leer.nextInt();
        System.out.println("digite numero 2:");
        int num2 = leer.nextInt();

        int res = num1;
        num1 = num2;
        num2 = res;

        System.out.println("las variables invertidas son: " + num1 + " y " + num2);
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

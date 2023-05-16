/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3_buclesycondicionales;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class ej5B {

    public static void main(String[] args) {
        
        try{

        Scanner leer = new Scanner(System.in);
        System.out.println("digite numero");
        double num = leer.nextDouble();
        System.out.println("digite exponente");
        double exp = leer.nextDouble();
        double res = (int) Math.pow(num, exp);

        if (exp * -1 < 0) {

            System.out.println(res);

        }
        if (exp == 0) {

            System.out.println(res = 1);

        }
        if (exp * -1 > 0) {

            System.out.println(res = 1 / exp);

        }

        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

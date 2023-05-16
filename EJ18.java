/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre: ");
        String nombre = leer.next();
        System.out.println("ingrese apellido1: ");
        String A1 = leer.next();
        System.out.println("ingrese apellido2: ");
        String A2 = leer.next();

        System.out.println("sus iniciales son: " + nombre.charAt(0) + A1.charAt(0) + A2.charAt(0));
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

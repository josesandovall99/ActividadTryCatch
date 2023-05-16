/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3_buclesycondicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE SANDOVAL
 */
public class ej9BUCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "CANTIDAD DE NUMEROS PRIMOS A MOSTRAR"));
        int numero = 2;
        int contador = 0;

        while (contador < num) {
            boolean Esprimo = true;

            for (int i = 2; i < numero; i++) {

                if (numero % i == 0) {
                    Esprimo = false;
                }
            }
            
            if (Esprimo) {
                System.out.print("(" + numero + ")");
                contador++;
            }

            numero++;

        }
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}
//import java.util.Scanner;
//
//public class ej9BUCL {
//    public static boolean esPrimo(int numero) {
//        if (numero < 2) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(numero); i++) {
//            if (numero % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Ingrese la cantidad de números primos que quiere mostrar: ");
//        int cantidad = sc.nextInt();
//
//        int contador = 0;
//        int numero = 2;
//
//        while (contador < cantidad) {
//            if (esPrimo(numero)) {
//                System.out.print(numero + " ");
//                contador++;
//            }
//            numero++;
//        }
//    }
//}


//import java.util.Scanner;
//
//public class ej9BUCL {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Ingrese la cantidad de números primos que quiere mostrar: ");
//        int cantidad = sc.nextInt();
//
//        int contador = 0;
//        int numero = 2;
//
//        while (contador < cantidad) {
//            boolean esPrimo = true;
//            for (int i = 2; i < numero; i++) {
//                if (numero % i == 0) {
//                    esPrimo = false;
//                    break;
//                }
//            }
//            if (esPrimo) {
//                System.out.print(numero + " ");
//                contador++;
//            }
//            numero++;
//        }
//    }
//}

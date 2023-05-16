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
public class ej5BUCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try{
        int num1;
        int num2;

        while (true) {
            num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LIMITE INFERIOR DEL INTERVALO"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LIMITE SUPERIOR DEL INTERVALO"));

            if (num1 < num2) {
                break;
            }
            System.out.println("limite inferior mayor al limite superior");
        }
        System.out.println("INTERVALO: ENTRE " + num1 + " Y " + num2);
        int suma = 0;
        System.out.println("SUMA DE LOS NUMEROS QUE ESTAN A DENTRO DEL INTERVALO");
        for (int i = num1; i <= num2; i++) {

            suma = suma + i;

        }
        System.out.println("(" + suma + ")");
        System.out.println("NUMEROS A FUERA DEL INTERVALO");
        boolean ind = false;
        while (true) {

            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UN NUMERO \n 0 = SALIR"));
            if (num == 0) {
                System.out.println();
                break;
            }
            if (num < num1 || num > num2) {

                System.out.print("(" + num + ")");

            }
            if (num == num1 || num == num2) {
                ind = true;

            } else {
                ind = false;
            }

        }
        if (ind == true) {
            System.out.println("HAS INTRODUCIDO UN NUMERO IGUAL A LOS LIMITES DEL INTERVALO");
        }
        if (ind == false) {
            System.out.println("NO HAS INTRODUCIDO UN NUMERO IGUAL A LOS LIMITES DEL INTERVALO");
        }
        JOptionPane.showMessageDialog(null, "programa cerrado");
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

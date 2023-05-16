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
public class ARR4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
        int[][] num = new int [5][4]; 
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                num [j][i]= (int)(Math.random()*900+ 100);
                System.out.print("("+num[j][i]+")");
            }
            System.out.println();
            
        } 
        int sumC1 = num[0][0] + num[0][1] + num[0][2] + num[0][3];
        int sumC2 = num[1][0] + num[1][1] + num[1][2] + num[1][3];
        int sumC3 = num[2][0] + num[2][1] + num[2][2] + num[2][3];
        int sumC4 = num[3][0] + num[3][1] + num[3][2] + num[3][3];
        int sumC5 = num[4][0] + num[4][1] + num[4][2] + num[4][3];
        System.out.println("LA SUMA DE COLUMNA 1 ES: " + sumC1);
        System.out.println("LA SUMA DE COLUMNA 2 ES: " + sumC2);
        System.out.println("LA SUMA DE COLUMNA 3 ES: " + sumC3);
        System.out.println("LA SUMA DE COLUMNA 4 ES: " + sumC4);
        int sumF1 = num[0][0] + num[1][0] + num[2][0] + num[3][0] + num [4][0];
        int sumF2 = num[0][1] + num[1][1] + num[2][1] + num[3][1] + num [4][1];
        int sumF3 = num[0][2] + num[1][2] + num[2][2] + num[3][2] + num [4][2];
        int sumF4 = num[0][3] + num[1][3] + num[2][3] + num[3][3] + num [4][3];
        System.out.println("LA SUMA DE FILA 1 ES: " + sumF1);
        System.out.println("LA SUMA DE FILA 2 ES: " + sumF2);
        System.out.println("LA SUMA DE FILA 3 ES: " + sumF3);
        System.out.println("LA SUMA DE FILA 4 ES: " + sumF4);
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

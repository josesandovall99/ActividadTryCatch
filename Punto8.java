/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package co.edu.udes.taller1p2;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Punto8 {

    public static void main(String[] args) {
        
        try{
        int[][] horas = new int[12][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 12; j++) {
                horas[j][i]=Integer.parseInt(JOptionPane.showInputDialog(null, "digite horas de mes " + (j+1) + " y asignatura " + (i+1)));
                System.out.print("(" + horas[j][i] + ")");
            }
            System.out.println();

        }
        int sumC1 = horas[0][0] + horas[0][1] + horas[0][2] + horas[0][3] + horas[0][4];
        int sumC2 = horas[1][0] + horas[1][1] + horas[1][2] + horas[1][3] + horas[1][4];
        int sumC3 = horas[2][0] + horas[2][1] + horas[2][2] + horas[2][3] + horas[2][4];
        int sumC4 = horas[3][0] + horas[3][1] + horas[3][2] + horas[3][3] + horas[3][4];
        int sumC5 = horas[4][0] + horas[4][1] + horas[4][2] + horas[4][3] + horas[4][4];
        int sumC6 = horas[5][0] + horas[5][1] + horas[5][2] + horas[5][3] + horas[5][4];
        int sumC7 = horas[6][0] + horas[6][1] + horas[6][2] + horas[6][3] + horas[6][4];
        int sumC8 = horas[7][0] + horas[7][1] + horas[7][2] + horas[7][3] + horas[7][4];
        int sumC9 = horas[8][0] + horas[8][1] + horas[8][2] + horas[8][3] + horas[8][4];
        int sumC10 = horas[9][0] + horas[9][1] + horas[9][2] + horas[9][3] + horas[9][4];
        int sumC11 = horas[10][0] + horas[10][1] + horas[10][2] + horas[10][3] + horas[10][4];
        int sumC12 = horas[11][0] + horas[11][1] + horas[11][2] + horas[11][3] + horas[11][4];

        System.out.println("HORAS DEDICADAS AL MES DE ENERO: " + sumC1);
        System.out.println("HORAS DEDICADAS AL MES DE FEBRERO: " + sumC2);
        System.out.println("HORAS DEDICADAS AL MES DE MARZO: " + sumC3);
        System.out.println("HORAS DEDICADAS AL MES DE ABRIL: " + sumC4);
        System.out.println("HORAS DEDICADAS AL MES DE MAYO: " + sumC5);
        System.out.println("HORAS DEDICADAS AL MES DE JUNIO: " + sumC6);
        System.out.println("HORAS DEDICADAS AL MES DE JULIO: " + sumC7);
        System.out.println("HORAS DEDICADAS AL MES DE AGOSTO: " + sumC8);
        System.out.println("HORAS DEDICADAS AL MES DE SEPTIEMBRE: " + sumC9);
        System.out.println("HORAS DEDICADAS AL MES DE OCTUBRE: " + sumC10);
        System.out.println("HORAS DEDICADAS AL MES DE NOVIEMBRE: " + sumC11);
        System.out.println("HORAS DEDICADAS AL MES DE DICIEMBRE: " + sumC12);

        int sumF1 = horas[0][0] + horas[1][0] + horas[2][0] + horas[3][0] + horas[4][0] + horas[5][0] + horas[6][0] + horas[7][0] + horas[8][0] + horas[9][0] + horas[10][0] + horas[11][0];
        int sumF2 = horas[0][1] + horas[1][1] + horas[2][1] + horas[3][1] + horas[4][1] + horas[5][1] + horas[6][1] + horas[7][1] + horas[8][1] + horas[9][1] + horas[10][1] + horas[11][1];
        int sumF3 = horas[0][2] + horas[1][2] + horas[2][2] + horas[3][2] + horas[4][2] + horas[5][2] + horas[6][2] + horas[7][2] + horas[8][2] + horas[9][2] + horas[10][2] + horas[11][2];
        int sumF4 = horas[0][3] + horas[1][3] + horas[2][3] + horas[3][3] + horas[4][3] + horas[5][3] + horas[6][3] + horas[7][3] + horas[8][3] + horas[9][3] + horas[10][3] + horas[11][3];
        int sumF5 = horas[0][4] + horas[1][4] + horas[2][4] + horas[3][4] + horas[4][4] + horas[5][4] + horas[6][4] + horas[7][4] + horas[8][4] + horas[9][4] + horas[10][4] + horas[11][4];

        System.out.println("HORAS ANUALES DEDICADAS A ASIGATURA 1: " + sumF1);
        System.out.println("HORAS ANUALES DEDICADAS A ASIGATURA 2: " + sumF2);
        System.out.println("HORAS ANUALES DEDICADAS A ASIGATURA 3: " + sumF3);
        System.out.println("HORAS ANUALES DEDICADAS A ASIGATURA 4: " + sumF4);
        System.out.println("HORAS ANUALES DEDICADAS A ASIGATURA 5: " + sumF5);
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.taller1p2;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Punto_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{

        int nSeg;
        int D;
        int H;
        int M;
        int S;

        nSeg = Integer.parseInt(JOptionPane.showInputDialog("digita segundos totales: "));

        D = nSeg / 86400;
        H = nSeg / 3600;
        M = (nSeg/60) % 60;
        S = nSeg % 60;

        String resultado = "DIAS: " + " " + D
                + " HORAS:" + " " + H
                + " MINUTOS: " + " " + M
                + " SEGUNDOS: " + " " + S;
        JOptionPane.showMessageDialog(null, resultado);
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }

    }
}
    


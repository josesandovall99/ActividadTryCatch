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
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       try{

        int NUM = Integer.parseInt(JOptionPane.showInputDialog("Digite CANTIDAD DE LA SERIE:"));

        int[] serieF = new int[NUM];

        serieF[0] = 0;
        serieF[1] = 1;

        for (int i = 2; i < NUM; i++) {

            serieF[i] = serieF[i - 1] + serieF[i - 2];
            

        }

        String mensaje = "serie: ";
        
        for (int i = 0; i < NUM; i++) {
            mensaje += serieF[i] + "/";

        }
        JOptionPane.showMessageDialog(null, "\n" + mensaje);
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }

    }

}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.taller1p2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try{
        int longitud1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el cantidad del primer vector:"));
        int longitud2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el cantidad del segundo vector:"));

        int[] almacen1 = new int[longitud1];
        int[] almacen2 = new int[longitud2];

        JOptionPane.showMessageDialog(null, "DATOS DE VECTOR 1");
        for (int i = 0; i < longitud1; i++) {
            almacen1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "DATO NUM" + (i + 1)));
        }

        JOptionPane.showMessageDialog(null, "DATOS DE VECTOR 2");
        for (int i = 0; i < longitud2; i++) {
            almacen2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "DATO NUM" + (i + 1)));
        }

        int[] Unico = new int[longitud1 + longitud2];

        System.arraycopy(almacen1, 0, Unico, 0, longitud1);
        System.arraycopy(almacen2, 0, Unico, longitud1, longitud2);

        Arrays.sort(Unico);

        JOptionPane.showMessageDialog(null, "El vector fusionado y ordenado es:\n" + Arrays.toString(Unico));
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

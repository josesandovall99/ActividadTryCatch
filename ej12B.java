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
public class ej12B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try{
        int duracion = Integer.parseInt(JOptionPane.showInputDialog(null, "cuanto duro la llamada (min)"));
        int dom = Integer.parseInt(JOptionPane.showInputDialog(null, "fue realizada un DOMINGO? \n si = 1 \n no = 2"));
        double cos;

        switch (dom) {

            case 1:
                if (duracion <= 5) {

                    cos = 1 + 1 * 0.03;
                    JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 3%");

                }
                if (duracion <= 8 && duracion>5) {

                    cos = 1.8 + 1.8 * 0.03;
                    JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 3%");

                }
                if (duracion < 10 && duracion>8) {

                    cos = 2.4 + 2.4 * 0.03;
                    JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 3%");

                }
                if (duracion >= 10) {

                    cos = 2.9 + 2.9 * 0.03;
                    JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 3%");

                }

            case 2:
                if (duracion <= 5) {

                    int man = Integer.parseInt(JOptionPane.showInputDialog(null, "fue realizada en la MAÑANA? \n si = 1 \n no = 2"));

                    if (man == 1) {
                        cos = 1 + 1 * 0.15;
                        JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 15%");
                    } else {
                        cos = 1 + 1 * 0.1;
                        JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 10%");
                    }

                }
                if (duracion <= 8 && duracion >5) {

                    int man = Integer.parseInt(JOptionPane.showInputDialog(null, "fue realizada en la MAÑANA? \n si = 1 \n no = 2"));

                    if (man == 1) {
                        cos = 1.8 + 1.8 * 0.15;
                        JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 15%");
                    } else {
                        cos = 1.8 + 1.8 * 0.1;
                        JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 10%");
                    }
                }
                if (duracion < 10 && duracion>8) {

                    int man = Integer.parseInt(JOptionPane.showInputDialog(null, "fue realizada en la MAÑANA? \n si = 1 \n no = 2"));

                    if (man == 1) {
                        cos = 2.4 + 2.4 * 0.15;
                        JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 15%");
                    } else {
                        cos = 2.4 + 2.4 * 0.1;
                        JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 10%");
                    }
                }
                if (duracion >= 10) {

                    int man = Integer.parseInt(JOptionPane.showInputDialog(null, "fue realizada en la MAÑANA? \n si = 1 \n no = 2"));

                    if (man == 1) {
                        cos = 2.9 + 2.9 * 0.15;
                        JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 15%");
                    } else {
                        cos = 2.9 + 2.9 * 0.1;
                        JOptionPane.showMessageDialog(null, "DURACION DE LLAMADA: " + duracion + " \nCOSTO DE LLAMADA: " + cos + " EUROS " + " \nIMPUESTO AÑADIDO: 10%");
                    }
                }

        }
} catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

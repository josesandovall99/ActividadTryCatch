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
public class ej16B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        int zon = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE ZONA DE UBICACION \n 1) AMERICA DEL NORTE \n 2) AMERICA CENTRAL \n 3) AMERICA DEL SUR \n 4) EUROPA \n 5) ASIA"));
        double kg = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE PESO DE PAQUETE (KG): "));
        double costo;

        if (kg < 5 && kg > 0) {
            
            switch (zon) {

            case 1:
                costo = kg * 24;
                JOptionPane.showMessageDialog(null, "EL COSTO DEL SERVICIO SERA DE " + costo + " EUROS");
                break;
            case 2:
                costo = kg * 20;
                JOptionPane.showMessageDialog(null, "EL COSTO DEL SERVICIO SERA DE " + costo + " EUROS");
                break;
            case 3:
                costo = kg * 21;
                JOptionPane.showMessageDialog(null, "EL COSTO DEL SERVICIO SERA DE " + costo + " EUROS");
                break;
            case 4:
                costo = kg * 10;
                JOptionPane.showMessageDialog(null, "EL COSTO DEL SERVICIO SERA DE " + costo + " EUROS");
                break;
            case 5:
                costo = kg * 18;
                JOptionPane.showMessageDialog(null, "EL COSTO DEL SERVICIO SERA DE " + costo + " EUROS");
                break;

        }
            
        }else{System.out.println("LO SENTIMOS, PESO NO ADECUADO");}
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
        }
    }



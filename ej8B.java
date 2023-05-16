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
public class ej8B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{

        double l1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite lado 1"));
        double l2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite lado 2"));
        double l3 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite lado 3"));
        
        double ec = (l1+l2+l3)/3;
        boolean a = true;

        if (Math.hypot(l1, l2) == l3) {

            JOptionPane.showMessageDialog(null, "el triangulo es RECTANGULO");

        }if (l1!=l2 && l2!=l3 && l1!=l3 && Math.hypot(l1, l2) != l3) {

            JOptionPane.showMessageDialog(null, "el triangulo es ESCALENO");

        }if (l1==l2 && l2 ==l3) {

            JOptionPane.showMessageDialog(null, "el triangulo es EQUILATERO");

        }if ((l1==l2 & l2!=l3)||(l1==l3 && l3!=l2)||(l1==l3 & l3!=l2)) {

            JOptionPane.showMessageDialog(null, "el triangulo es ISOCELES");

        }
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }

    }

}

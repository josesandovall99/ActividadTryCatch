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
public class ej14B {

    public static void main(String[] args) {

        
        try{
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL DIA DE LA SEMANA (1-7): "));
        if (dia <1 || dia>7) {
            System.out.println("ERROR");
        }
        
        switch(dia){
        
            case 1: JOptionPane.showMessageDialog(null,"EL DIA ES LUNES");break;
            case 2: JOptionPane.showMessageDialog(null,"EL DIA ES MARTES");break;
            case 3: JOptionPane.showMessageDialog(null,"EL DIA ES MIERCOLES");break;
            case 4: JOptionPane.showMessageDialog(null,"EL DIA ES JUEVES");break;
            case 5: JOptionPane.showMessageDialog(null,"EL DIA ES VIERNES");break;
            case 6: JOptionPane.showMessageDialog(null,"EL DIA ES SABADO");break;
            case 7: JOptionPane.showMessageDialog(null,"EL DIA ES DOMINGO");break;
            
        
        }
} catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

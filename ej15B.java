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
public class ej15B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL MES DEL AÑO (1-12): "));
        if (dia <1 || dia>12) {
            System.out.println("ERROR");
        }
        
        switch(dia){
        
            case 1: JOptionPane.showMessageDialog(null,"EL MES ES ENERO Y TIENE 31 DIAS");break;
            case 2: JOptionPane.showMessageDialog(null,"EL MES ES FEBRERO Y TIENE 29 DIAS");break;
            case 3: JOptionPane.showMessageDialog(null,"EL MES ES MARZO Y TIENE 31 DIAS");break;
            case 4: JOptionPane.showMessageDialog(null,"EL MES ES ABRIL Y TIENE 30 DIAS");break;
            case 5: JOptionPane.showMessageDialog(null,"EL MES ES MAYO Y TIENE 31 DIAS");break;
            case 6: JOptionPane.showMessageDialog(null,"EL MES ES JUNIO Y TIENE 30 DIAS");break;
            case 7: JOptionPane.showMessageDialog(null,"EL MES ES JULIO Y TIENE 31 DIAS");break;
            case 8: JOptionPane.showMessageDialog(null,"EL MES ES AGOSTO Y TIENE 31 DIAS");break;
            case 9: JOptionPane.showMessageDialog(null,"EL MES ES SEPTIEMBRE Y TIENE 30 DIAS");break;
            case 10: JOptionPane.showMessageDialog(null,"EL MES ES OCTUBRE Y TIENE 31 DIAS");break;
            case 11: JOptionPane.showMessageDialog(null,"EL MES ES NOVIEMBRE Y TIENE 30 DIAS");break;
            case 12: JOptionPane.showMessageDialog(null,"EL MES ES DICIEMBRE Y TIENE 31 DIAS");break;
            
        
        }

        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

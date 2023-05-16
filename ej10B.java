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
public class ej10B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        double pre = Double.parseDouble(JOptionPane.showInputDialog(null, "digite precio de kilo de uva en EUROS"));
       int num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite tamaño \n 1 / 2  "));
       int tip = Integer.parseInt(JOptionPane.showInputDialog(null, "digite tipo \n A=1 / B=2  "));
       
       switch(num){
       
           case 1: switch(tip){
           
               case 1: pre = pre+0.20;
               JOptionPane.showMessageDialog(null, "el precio final del kilo de uva tamaño " + num + " y tipo " + tip + " es de : " + pre + " \n 20 centimos cargados ");
               break;
               case 2: pre = pre+0.30;
               JOptionPane.showMessageDialog(null, "el precio final del kilo de uva tamaño " + num + " y tipo " + tip + " es de : " + pre+ " \n 30 centimos cargados ");
               break;
           
           }break;
           case 2: switch(tip){
           
               case 1: pre = pre-0.20;
               JOptionPane.showMessageDialog(null, "el precio final del kilo de uva tamaño " + num + " y tipo " + tip + " es de : " + pre+ " \n 30 centimos rebajados ");
               break;
               case 2: pre = pre-0.50;
               JOptionPane.showMessageDialog(null, "el precio final del kilo de uva tamaño " + num + " y tipo " + tip + " es de : " + pre+ " \n 50 centimos rebajados ");
               break;
           
           }break;
       
       }
       
       } catch (Exception e) {
            
            System.out.println("hay un error");
        }
       
       
    }
    
}

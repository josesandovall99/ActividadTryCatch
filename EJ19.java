/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese cantidad de preguntas contenidas en el examen: ");
        int cont = leer.nextInt();
        
        System.out.println("ingrese numero de preguntas acertadas");
        double preA = leer.nextDouble();
        System.out.println("ingrese numero de preguntas erradas: ");
        double preE = leer.nextDouble();
        System.out.println("ingrese numero de preguntas sin responder: ");
        double preS = leer.nextDouble();
        double tot = preA + preE+ preS;
        if (tot!=cont) {
            
            System.out.println("Error. cantidad no coincide con numero de preguntas (se digitan " + cont + " respuestas)");
            
        }else{
        double def = (preA * 5 - preE * 1 + preS*0)/cont;

        System.out.println("la nota final es:" + def);}
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }

       
    }
    
}

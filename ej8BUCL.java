/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3_buclesycondicionales;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JOSE SANDOVAL
 */
public class ej8BUCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        int num= 0;
        
        
        for (int horas = 0; horas < 24; horas++) {
            for (int minutos = 0; minutos < 60; minutos++) {
                for (int segundos = 0; segundos < 60; segundos++) {
                    try {
                        System.out.println(horas+" : " + minutos + " : " + segundos);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }
                    
                    
                }
                
            }
            
        }
        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }
    
}

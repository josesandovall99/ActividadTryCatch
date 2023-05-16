/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite hora de partida: ");
        double hor = leer.nextDouble();
        System.out.println("Digite minutos de partida: ");
        double min = leer.nextDouble();
        System.out.println("Digite segundos de partida: ");
        double seg = leer.nextDouble();
        double horseg = hor*3600;
        double minseg = min*60;
        double horaPartidaSeg = horseg + minseg + seg;
        System.out.println("Digite segundos que tardo en recorrer la distancia:");
        double horaLlegadaSeg = leer.nextDouble();

        double horaLleg = (horaLlegadaSeg + horaPartidaSeg);
        
        System.out.println(horaLlegadaSeg+" " + horaPartidaSeg);

        double horaLLegadaH = horaLleg / 3600;
        
        System.out.println(horaLleg);

        System.out.println("el ciclista llega a las " + (int)horaLLegadaH + " horas del dia");
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

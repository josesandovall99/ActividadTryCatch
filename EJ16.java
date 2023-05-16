/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

public class EJ16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Scanner leer = new Scanner(System.in);
        double v1;
        double v2;
        double distancia;
        double diferenciaVelocidad;
        double tiempo;
        System.out.println("Este programa calcula el tiempo que tardan en encontrarse dos vehículos que circulan a distinta velocidad y parten desde una distancia inicial.");
        System.out.println("Introduce la distancia a la que se encuentran situados ambos vehículos: ");
        distancia = leer.nextDouble();
        System.out.println("Velocidad en Km/h del vehículo 1 (más lento): ");
        v1 = leer.nextDouble();
        System.out.println("Velocidad en Km/h del vehículo 2 (más rápido): ");
        v2 = leer.nextInt();

        diferenciaVelocidad = v2 - v1;
        if (diferenciaVelocidad < 0 ) {
            diferenciaVelocidad = diferenciaVelocidad*(-1);
        }
        tiempo = distancia / (diferenciaVelocidad);

        tiempo = tiempo * 60;
        System.out.println("Ambos vehículos coincidirán una vez transcurridos " + (int) tiempo + " minutos.");
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}

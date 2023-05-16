/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.udes.ejercicio_en_clase;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Ejercicio_En_Clase {

    public static void main(String[] args) {
        
        
        Gerente D1 = new Gerente("juan",2000);
        System.out.println(D1);
        D1.incrementarsalario();
        
        
        Tecnico D2 = new Tecnico("jose",3000);
        System.out.println(D2);
        D2.incrementarsalario();
         
        Secretaria D3 = new Secretaria("luis",4000);
        System.out.println(D3);
        D3.incrementarsalario();
        
        Supervisor D4 = new Supervisor("carlos",5000);
        System.out.println(D4);
        D4.incrementarsalario();
        
        
    }
}

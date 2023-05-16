/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.ejercicio_en_clase;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Secretaria extends Directivo {

    public Secretaria(String nombre, double salario) {
        super(nombre, salario);
    }

    

    
    
    @Override
    public String toString() {
        return this.getNombre() + "-> Secretaria" + super.toString();
    }
    
    @Override
    public void incrementarsalario(){
    
        this.setSalario(this.getSalario() + this.getSalario() * 0.20);
    }
    
}

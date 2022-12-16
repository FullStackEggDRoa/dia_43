/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_8.Entidades;

/**
 *
 * @author droa
 */
public class Cadena {
    // Atributos
    
    private String frase;
    private int longitud;
    
    // Contrusctores

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    
    // Métodos

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
    
    
    
}

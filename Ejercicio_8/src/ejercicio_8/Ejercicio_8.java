/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;

import ejercicio_8.Entidades.Cadena;
import ejercicio_8.Servicio.servicioCadena;

/**
 *
 * @author droa
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Clase Cadena");
        servicioCadena sC = new servicioCadena();
        Cadena cad1 = sC.crearCadena();
        sC.mostrarVocales(cad1);
        sC.invertirFrase(cad1);
    }
    
}

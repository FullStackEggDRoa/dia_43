/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;

import ejercicio_8.Entidades.Cadena;
import ejercicio_8.Servicio.servicioCadena;
import java.util.Scanner;

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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Clase Cadena");
        servicioCadena sC = new servicioCadena();
        Cadena cad1 = sC.crearCadena();
        sC.mostrarVocales(cad1);
        sC.invertirFrase(cad1);
        System.out.print("Ingrese caracter a Validar (Repetición): ");
        cad1.vecesRepetido(leer.next());
        System.out.print("Ingrese otra Frase: ");
        cad1.comprarLongitud(leer.next());
        System.out.print("Ingrese otra Frase: ");
        cad1.unirFrases(leer.next());
        System.out.println("Ingrese una letra de reemplazo: ");
        cad1.reemplazar(leer.next());
        System.out.println("Ingrese una letra a buscar: ");
        if (cad1.contiene(leer.next())){
            System.out.println("VERDADERO: Encontrada en la Frase");
        }else{
            System.out.println("FALSO: No encontrada en la Frase");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_8.Servicio;

import ejercicio_8.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class servicioCadena {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Cadena crearCadena(){
        System.out.print("Ingrese una frase: ");
        return new Cadena(leer.next());
    }
    
    public void mostrarVocales(Cadena frase){
        int contador_vocales=0;
        if(frase.getFrase().contains("a") || frase.getFrase().contains("e") || frase.getFrase().contains("i") || frase.getFrase().contains("o") || frase.getFrase().contains("u") ){
            contador_vocales++;
        }
        System.out.println("Total Vocales en la frase es: "+contador_vocales);
    }
    public void invertirFrase(Cadena frase){
        String soloFrase = frase.getFrase();
        String stringAux="";
        for (int i=(soloFrase.length()-1);i >= 0;i--){
            stringAux+=soloFrase.charAt(i);
        }
        System.out.println("Frase Invertida: "+stringAux);
    }
}

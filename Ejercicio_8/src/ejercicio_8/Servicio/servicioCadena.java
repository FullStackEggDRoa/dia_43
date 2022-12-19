/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_8.Servicio;

import ejercicio_8.Entidades.Cadena;
import static ejercicio_8.Entidades.Cadena.ANSI_CYAN;
import static ejercicio_8.Entidades.Cadena.ANSI_RESET;
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
        CharSequence[] charBusqueda={"a","e","i","o","u"};
        for(int i=0;i<charBusqueda.length;i++){
            if(frase.getFrase().contains(charBusqueda[i])){
                for(int j=0;j<frase.getLongitud();j++)
                {
                    if(frase.getFrase().substring(j, j+1).equals(charBusqueda[i])){
                        contador_vocales++;
                    }
                }
            }
        }
        System.out.println("Total Vocales en la frase es: "+ANSI_CYAN+contador_vocales+ANSI_RESET);
    }
    public void invertirFrase(Cadena frase){
        String soloFrase = frase.getFrase();
        String stringAux="";
        for (int i=(soloFrase.length()-1);i >= 0;i--){
            stringAux+=soloFrase.charAt(i);
        }
        System.out.println("Frase Invertida: "+ANSI_CYAN+stringAux+ANSI_RESET);
    }
    
}

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
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
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
    
    public void vecesRepetido(String letra){
        int contador_caracter=0;
        
        char charBusqueda=letra.charAt(0);
        for (int i=0;i<frase.length();i++){
            if(frase.charAt(i)==charBusqueda){
                contador_caracter++;
            }
        }
        System.out.println("La letra '"+charBusqueda+"' aparece repetida "+contador_caracter+" veces.");
    }
    
    public void comprarLongitud(String Frase){
        
        System.out.println("La Frase Ingresada tiene una longitud de "+ANSI_RED+Frase.length()+ANSI_RESET+" en comparación de la Frase Original, con una longitud de: "+ANSI_RED+this.frase.length()+ANSI_RESET+".");
    }
    
    public void unirFrases(String Frase){
        String concat = this.frase.concat(" "+Frase);
        this.frase=concat;
        //System.out.println(frase); //Para pruebas Solamente
    }
    public void reemplazar(String letra){
        
        CharSequence charBusqueda="a";
        String fraseAux="";
        for (int i=0;i<frase.length();i++){
            if(frase.substring(i,i+1).equals(charBusqueda)){
                fraseAux=frase.replace(charBusqueda, letra);
                
            }
           
        }
        System.out.println("Frase Modificada: "+fraseAux);
    }
    
    public boolean contiene(String letra){
        boolean resultado=false;
        char charBusqueda=letra.charAt(0);
       
        if (frase.contains(Character.toString(charBusqueda))) {
            resultado=true;
        }
        return resultado;
    }
}

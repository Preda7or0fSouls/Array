package Ejercicios;
import java.util.Scanner;
import Utiles.Utilidades;
import java.util.StringTokenizer;

import Utiles.Utilidades;
public class Palabras1 {
	public static int cuentaPalabras(String s){    
	    int acumulador = 0;    
	    boolean palabra = false;
	    int finDeLinea = s.length() - 1;

	    for (int x = 0; x < s.length(); x++) {
	       
	        if (Character.isLetter(s.charAt(x)) && x != finDeLinea) {
	            palabra = true;
	            
	            
	        } else if (!Character.isLetter(s.charAt(x)) && palabra) {
	            acumulador++;
	            palabra = false;
	         
	        } else if (Character.isLetter(s.charAt(x)) && x == finDeLinea) {
	           acumulador++;
	        }
	    }
	    return acumulador;
	}
public static void main(String[] args) {
	String cuentaPalabras;
	Utilidades.leerCadena("Palabras : " + cuentaPalabras);
}
	 
}
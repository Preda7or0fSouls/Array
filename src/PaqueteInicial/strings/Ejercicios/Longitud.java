package Ejercicios;

import Utiles.Utilidades;

public class Longitud {
	public static int tamañopalabras(String[] palabras, int longitud) {
		int tamaño =0;
		for(int x=0;x<palabras.length;x++) {
			if(palabras[x].length() == longitud) {
				tamaño++;
			}
			
		}
		return tamaño;
	}
	public static void main(String[] args) {
		String cadena = Utilidades.leerCadena("Introduce una frase");
		String palabras[] = Utilidades.dividirEnPalabras(cadena);
		int longitud = Utilidades.leerEntero("Que tamaño de palabras deseas contar");
		System.out.printf("La cadena contiene %d palabras  de longitud %d",  tamañopalabras(palabras, longitud), longitud);
	}
}

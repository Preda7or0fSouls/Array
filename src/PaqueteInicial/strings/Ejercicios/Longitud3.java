package Ejercicios;

import Utiles.Utilidades;

public class Longitud3 {
	public static int tamañopalabras(String[] palabras, int longitud) {
		int size = 0;
		for (int x = 0; x < palabras.length; x++) {
			if (palabras[x].length() == longitud) {
				size++;
			} else {
				System.out.println("Hay alguna palabra larga en caso contrario.");
			}

		}
		return size;
	}

	public static void main(String[] args) {
		String cadena;
		int longitud;
		cadena = Utiles.Utilidades.leerCadena("Introduce una frase");
		String palabras[] = Utiles.Utilidades.dividirEnPalabras(cadena);
		longitud = Utiles.Utilidades.leerEntero("Que tamaño de palabras deseas contar");
		System.out.printf("Todas las cadenas son cortas," + tamañopalabras(palabras, longitud), longitud);
	}
}

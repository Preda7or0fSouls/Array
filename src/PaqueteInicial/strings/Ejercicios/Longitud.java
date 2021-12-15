package Ejercicios;

import Utiles.Utilidades;

public class Longitud {
	public static int tamañopalabras(String[] palabras, int longitud) {
		int size = 0;
		for (int x = 0; x < palabras.length; x++) {
			if (palabras[x].length() == longitud) {
				size++;
			}

		}
		return size;
	}

	public static void main(String[] args) {
		String cadena;
		int longitud;
		cadena = Utilidades.leerCadena("Introduce una frase");
		String palabras[] = Utiles.Utilidades.dividirEnPalabras(cadena);
		longitud = Utiles.Utilidades.leerEntero("Que tamaño de palabras deseas contar?");
		System.out.printf("La cadena contiene %d palabras  de longitud %d ", tamañopalabras(palabras, longitud),
				longitud);
	}
}

package Ejercicios;

import Utiles.Utilidades;

public class Concat {
	public static String Cooncatenar(String cadena1, String cadena2) {
		return cadena1.concat(cadena2);

	}

	public static void main(String[] args) {
		String cadena1 = Utilidades.leerCadena("Introduce la 1ª cadena");
		String cadena2 = Utilidades.leerCadena("Introduce la 2ª cadena");

		System.out.println("El resultado es: " + Cooncatenar(cadena1, cadena2));
	}
}
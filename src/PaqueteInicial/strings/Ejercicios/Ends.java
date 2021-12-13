package Ejercicios;

import Utiles.Utilidades;

public class Ends {
	public static Boolean finalizaEn(String cadena1, String cadena2) {
		return cadena1.endsWith(cadena2);

	}

	public static void main(String[] args) {
		String cadena1 = Utilidades.leerCadena("Introduce la 1ª cadena");
		String cadena2 = Utilidades.leerCadena("Introduce la 2ª cadena");
		if (finalizaEn(cadena1, cadena2)) {
			System.out.println(cadena1 + " acaba en " + cadena2);
		} else {
			System.out.println(cadena1 + " no acaba en " + cadena2);
		}
	}
}

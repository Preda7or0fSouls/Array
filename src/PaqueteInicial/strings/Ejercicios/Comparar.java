package Ejercicios;

import Utiles.Utilidades;

public class Comparar {
	public static int comparar(String cadena1, String cadena2) {
		return cadena1.compareTo(cadena2);
	}

	public static void main(String[] args) {
		String cadena1 = Utilidades.leerCadena("Introduce la primera cadena");
		String cadena2 = Utilidades.leerCadena("Introduce la segunda cadena");
		int result = comparar(cadena1, cadena2);
		if (0 == result) {
			System.out.println("Las cadenas tienen el mismo valor");
		} else if (result < 0) {
			System.out.println(cadena1 + "su valor es mayor que " + cadena2);
		} else {
			System.out.println(cadena1 + "su valor es menor que " + cadena2);
		}
	}
}

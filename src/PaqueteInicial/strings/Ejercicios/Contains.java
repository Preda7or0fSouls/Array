package Ejercicios;

import Utiles.Utilidades;

public class Contains {
	public static Boolean Contiene(String cadena1, String cadena2) {
		return cadena1.contains(cadena2);

	}

	public static void main(String[] args) {
		String cadena1, cadena2;
		cadena1 = Utilidades.leerCadena("Introduce la 1ª cadena");
		cadena2 = Utilidades.leerCadena("Introduce la 2ª cadena");
		if (Contiene(cadena1, cadena2)) {
			System.out.println(cadena2 + " esta contenida en " + cadena1);
		} else {
			System.out.println(cadena2 + " no esta contenida en " + cadena1);
		}
	}
}

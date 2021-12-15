package Ejercicios;

import Utiles.Utilidades;

public class Reemplazar {
	public static String remplazar(String cadena1, char letra1, char letra2) {
		return cadena1.replace(letra1, letra2);

	}

	public static void main(String[] args) {
		String cadena1;
		char letra1, letra2;
		cadena1 = Utiles.Utilidades.leerCadena("Introduce la 1ª cadena");
		letra1 = Utiles.Utilidades.leerCaracter("Introduce el carácter primero");
		letra2 = Utiles.Utilidades.leerCaracter("Introduce el carácter segundo");

		System.out.println("El resultado es: " + remplazar(cadena1, letra1, letra2));
	}
}
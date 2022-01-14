package Ejercicios;

import Utilidades;

public class Parentesis {
	public static boolean Parentizada(String cadena1) {
		int x = 0; // Palabra parentizada

		for (char leter : cadena1.toCharArray()) {
			if (leter == '(') {
				x++;
			} else if (leter == ')') {
				x--;
			}
			if (x == -1) {
				return false;
			}
		}
		return (x == 0);

	}

	public static void main(String[] args) {

		String frase = Utilidades.leerCadena("Introduce una frase:");

		if (Parentizada(frase)) {
			System.out.println("La cadena está bien parentizada");
		} else {
			System.out.println("La cadena NO está bien parentizada");
		}
	}
}

package Ejercicios;
import Utiles.Utilidades;

public class CompararIgnoreCase {
	public static int CompararIgnoreCase(String cadena1, String cadena2) {
		return cadena1.compareTo(cadena2);
	}

	public static void main(String[] args) {
		String cadena1 = Utilidades.leerCadena("Introduce la primera cadena");
		String cadena2 = Utilidades.leerCadena("Introduce la segunda cadena");
		int resultado = CompararIgnoreCase(cadena1, cadena2);
		if (0 == resultado) {
			System.out.println("Las cadenas tienen el mismo valor");
		} else if (resultado < 0) {
			System.out.println(cadena1 + "su valor es mayor que " + cadena2);
		} else {
			System.out.println(cadena1 + "su valor es menor que " + cadena2);
		}
	}
}
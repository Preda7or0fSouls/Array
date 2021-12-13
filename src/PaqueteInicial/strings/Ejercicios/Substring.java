package Ejercicios;

import Utiles.Utilidades;

public class Substring {
	public static String subcadena(String cadena1,int start, int end) {
		return cadena1.substring(start, end +1);
	}
	public static void main(String[] args) {
		int start = 0;
		int end = 0;
		String cadena1 = Utilidades.leerCadena("Introduce la 1ª cadena");
		
		start = Utilidades.leerEntero("De la posición");
		end = Utilidades.leerEntero("A la posición");
		
		System.out.println("La subcadena es: "+ subcadena(cadena1, start, end));
	}
}

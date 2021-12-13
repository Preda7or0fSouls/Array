package Ejercicios;
import Utiles.Utilidades;

public class IndexOf {
	public static int fistPosition(String cadena1, String cadena2) {
		return cadena1.indexOf(cadena2);

	}
	public static void main(String[] args) {
		String cadena1 = Utilidades.leerCadena("Introduce la 1ª cadena");
		String cadena2 = Utilidades.leerCadena("Introduce la 2ª cadena");
		int resultado = fistPosition(cadena1, cadena2);
		if(resultado >0) {
			System.out.println(cadena2 + " esta contenida en " + cadena1);
		}else {
			System.out.println(cadena2+ " no esta contenida en "+ cadena1);
		}
	}
}



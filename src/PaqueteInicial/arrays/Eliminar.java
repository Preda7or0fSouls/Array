
import Utilidades;

public class Eliminar {
	/*
	 * Escribid un programa Java para eliminar de un array un elemento específico
	 * (índice) introducido por el
	 * usuario (moviéndolo al final del mismo). Si el índice es mayor que el tamaño
	 * del array, debe decírselo al usuario y volver
	 * a pedírselo.
	 */
	public static void main(String[] args) {

		int[] elementos = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110 };
		int indice;

		indice = obtenerIndice(elementos);

		eliminarElemento(elementos, indice);

		Utilidades.mostrarArray(elementos);
	}

	public static int obtenerIndice(int[] elementos) {
		int indice;
		do {
			indice = Utilidades.leerEntero("Índice de elemento a eliminar");
		} while ((indice < 0) || (indice > (elementos.length - 1)));
		return indice;
	}

	public static void eliminarElemento(int[] elementos, int indiceBorrar) {
		int elementoBorrar = elementos[indiceBorrar];

		for (int i = indiceBorrar + 1; i < elementos.length; i++) {
			elementos[i - 1] = elementos[i];
		}

		elementos[elementos.length - 1] = elementoBorrar;
	}
}

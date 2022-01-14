package PaqueteInicial;

import PaqueteInicial.arrays.*;

public class AnalizaString {
    public static int cuantosSonDigitos(String cadena) {
        int acc = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                acc++;
            }

        }
        return acc;
    }

    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce cadena");

        System.out.print("Total Digitos: ");
        System.out.println();
        System.out.print("Total Letras: ");
        System.out.println();
        System.out.print("total otros simbolos: ");
    }

}

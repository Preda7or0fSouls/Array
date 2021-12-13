package Ejercicios;

import Utiles.Utilidades;

public class Invertida {
    public static String inversion(String[] palabras) {
        String invertida = "";
        int i;
        for (i = palabras.length - 1; i >= 0; i--) {
            invertida = invertida + palabras[i] + " ";
        }
        return invertida;
    }

    public static void main(String[] args) {
        String invertida = inversion(
                Utiles.Utilidades.dividirEnPalabras(Utiles.Utilidades.leerCadena("Introduce texto: ")));
        System.out.println(invertida);
    }
}

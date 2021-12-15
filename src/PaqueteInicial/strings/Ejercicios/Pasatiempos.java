package Ejercicios;

import Utiles.Utilidades;

public class Pasatiempos {
    public static String crearPasatempo(String frase) {

        String pasatempo = "";
        for (int i = 0; i < frase.length(); i++) {
            if ("aeiouAEIOUáéíóúÁÉÍÓÚàèìòùÀÈÌÒÙäëïöüÄËÏÖÜ".contains("" + frase.charAt(i))) {
                pasatempo = pasatempo + ".";
            } else {
                pasatempo = pasatempo + frase.charAt(i);
            }

        }
        return pasatempo;
    }

    public static void main(String[] args) {
        String solucion;
        String cadena;
        cadena = Utiles.Utilidades.leerCadena("Introduce cadena: ");

        solucion = crearPasatempo(cadena);

        System.out.println(solucion);
    }
}

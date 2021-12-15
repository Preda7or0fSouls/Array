package Ejercicios;

Utiles.Utilidades;
public class Siglas {
    public static String siglas(String[] palabras) {
        String siglas = "";

        for (String palabra : palabras) {
            char letra;
            letra = palabra.charAt(0);
            if (Character.isUpperCase(letra)) {
                siglas = siglas + letra;
            }

        }
        return siglas;
    }

    public static void main(String[] args) {

        String solucion = siglas(Utiles.Utilidades.dividirEnPalabras(Utiles.Utilidades.leerCadena("Introduce texto")));
        System.out.println(solucion);

    }
}

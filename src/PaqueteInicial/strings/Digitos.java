
import Utiles.Utilidades;

public class Digitos {
    public static int cuantosSonDigitos(String cadena) {
        int acc = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                acc++;
            }
        }
        return acc;
    }

    public static int cuantosSonDigitosDos(String cadena) {
        int acc = 0;

        for (char ch : cadena.toCharArray()) {

            if (ch >= 48 && ch <= 57) {
                acc++;
            }
        }

        return acc;
    }

    public static int cuantosSonDigitosTres(String cadena) {

        int acc = 0;

        for (char letra : cadena.toCharArray()) {
            if (Character.isDigit(letra)) {
                acc++;
            }
        }
        return acc;

    }

    public static int cuantosSonDigitosTres(char[] cadenaArray) {
        int acc = 0;

        for (char letra : cadenaArray) {
            if (Character.isDigit(letra)) {
                acc++;
            }
        }
        return acc;

    }

    public static void main(String[] args) {

        String cadena = Utiles.Utilidades.leerCadena("Introduce cadena");

        System.out.println("I. La cadena '" + cadena + "' tiene " + cuantosSonDigitos(cadena) + " dígitos");

        System.out.println("II.- La cadena '" + cadena + "' tiene " + cuantosSonDigitosDos(cadena) + " dígitos");

        System.out.println("III.- La cadena '" + cadena + "' tiene " + cuantosSonDigitosTres(cadena) + " dígitos");

        System.out.println(
                "IV.- La cadena '" + cadena + "' tiene " + cuantosSonDigitosTres(cadena.toCharArray()) + " dígitos");
    }

}

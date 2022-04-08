package Ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escribeprimos {
    public static void main(String[] args) {

        try {
            BufferedWriter x = new BufferedWriter(new FileWriter("primos.dat"));

            for (int i = 1; i < 501; i++) {
                if (Primo(i)) {
                    x.write(String.valueOf(i) + "\n");
                }
            }
            x.close();

        } catch (IOException ioe) {
            System.out.println("Error de escritura.");
        }
    }

    private static boolean Primo(int i) {
        return false;
    }
}

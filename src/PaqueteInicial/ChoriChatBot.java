package PaqueteInicial;

import java.util.Scanner;

public class ChoriChatBot {
    final static int CALLADO = 0;
    final static int CHARLA = 1;
    final static int REPETICION = 2;
    final static int FIN = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int modo = CALLADO;

        while (modo != FIN) {
            System.out.print("ChoriChat> ");
            String linea = entrada.nextLine().toLowerCase();
            modo = updateModo(modo, linea);
        }
        entrada.close();

    }

    private static void Impresion(int modo) {
        switch (modo){
            case = "CALLADO"
       }
    }
}

package PaqueteInicial;

public class ValoresACero {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        String fila = "";
        int contadorfilas = 0, contadorcolumnas = 0, contadorAuxiliar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                double aleatorio = Math.random();
                if (aleatorio <= 0.8) {
                    matriz[i][j] = 0;
                    fila = fila + " " + matriz[i][j];
                } else if (aleatorio > 0.8) {
                    matriz[i][j] = 1;
                    fila = fila + " " + matriz[i][j];
                }
            }
            System.out.println(fila);
            fila = "";
        }
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 0) {
                    contadorAuxiliar++;
                } else {
                    continue;
                }
            }
            if (contadorAuxiliar == 10) {
                contadorfilas++;
            }
            contadorAuxiliar = 0;

            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] == 0) {
                    contadorAuxiliar++;
                } else {
                    continue;
                }
            }
            if (contadorAuxiliar == 10) {
                contadorcolumnas++;
            }
            contadorAuxiliar = 0;
        }

        System.out.println();
        System.out.println("Hay " + contadorfilas + " filas de ceros");
        System.out.println("Hay " + contadorcolumnas + " columnas de ceros");
    }
}

package PaqueteInicial;

public class RellenaMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        rellenaMatriz(matriz);
    }

    public static void rellenaMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) Math.round(Math.random());
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


public class Comunes {
    public static void main(String[] args) {

        int[] primero = new int[1000000];
        Utilidades.rellenaArray(primero, 1, 1000000000);
        int[] segundo = new int[1000000];
        Utilidades.rellenaArray(segundo, 1, 1000000000);

        System.out.println("***********");
        System.out.println("*** Repetidos   ***");
        System.out.println("****************");

        for (int i = 0; i < primero.length; i++) {
            for (int j = 0; j < segundo.length; j++) {
                if (primero[i] == segundo[j]) {
                    System.out.println(primero[i]);
                }
            }
        }

    }
}

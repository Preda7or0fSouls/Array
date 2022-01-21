package PPOO;

import java.awt.Point;

public class Silla {

    private static final int x = 0;
    private static final int y = 100;
    private static final int PATAS_MIN = 0;
    private static final int PATAS_MAX = 6;
    private static final int COMODIDAD_MIN = 0;
    private static final int COMODIDAD_MAX = 10;

    private static final String[] colores = { "azul", "rojo", "amarillo", "negro", "blanco", "rosa" };
    private static final String[] materiales = { "plástico", "metal", "madera" };

    // Atributos de objetos
    private String color;
    private String material;
    private int numPatas;
    private boolean Respaldo;
    private int comodidad;
    private Point ubicacion;

    public Silla() {
        this.color = Silla.colorAleatorio();
        this.material = Silla.materialAleatorio();
        this.numPatas = Silla.numPatasAleatorio();
        this.Respaldo = Silla.respaldoAleatorio();
        this.comodidad = Silla.comodidadAleatorio();
        this.ubicacion = Silla.ubicacionAleatoria();
    }

    public static Point ubicacionAleatoria() {
        Point punto = new Point();

        int min = Silla.x;
        int max = Silla.y;

        int x = (int) (Math.random() * (max - min + 1) + min);
        int y = (int) (Math.random() * (max - min + 1) + min);

        punto.setLocation(x, y);

        return punto;
    }

    public static boolean respaldoAleatorio() {
        int min = 0;
        int max = 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        if (aleatorio == 0) {
            return false;
        } else {
            return true;
        }

    }

    public static int numPatasAleatorio() {
        int min = Silla.PATAS_MIN;
        int max = Silla.PATAS_MAX;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return aleatorio;
    }

    public static int comodidadAleatorio() {
        int min = Silla.COMODIDAD_MIN;
        int max = Silla.COMODIDAD_MAX;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return aleatorio;
    }

    public Silla(String color, String material, int numPatas, boolean Respaldo, int comodidad, Point ubicacion) {
        this.color = color;
        this.material = material;
        this.numPatas = numPatas;
        this.Respaldo = Respaldo;
        this.comodidad = comodidad;
        this.ubicacion = ubicacion;
    }

    public static String colorAleatorio() {
        int min = 0;
        int max = colores.length - 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return colores[aleatorio];
    }

    public static String materialAleatorio() {
        int min = 0;
        int max = materiales.length - 1;

        int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        return materiales[aleatorio];
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public boolean isRespaldo() {
        return Respaldo;
    }

    public void setTieneRespaldo(boolean Respaldo) {
        this.Respaldo = Respaldo;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    public Point getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Point ubicacion) {
        this.ubicacion = ubicacion;
    }

}

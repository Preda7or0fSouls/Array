package PPOO;

public class Alumno {

    private static int numAlumnos = 0;

    private short id;
    private String nombre;
    private String grupo;

    public Alumno(short identificador, String nombreAlumno) {
        id = identificador;
        nombre = nombreAlumno;
        grupo = "No Asignado";

        numAlumnos++;
    }

    public Alumno(short identificador, String nombreAlumno, String grupoAlumno) {
        id = identificador;
        nombre = nombreAlumno;
        grupo = grupoAlumno;

        numAlumnos++;
    }

    public void preguntarDuda() {
        System.out.print(nombre + "levanta la mano");
    }

    public static void ImprimirInforme() {
        System.out.println("total de alumnos: " + numAlumnos);

    }

    public static void ImprimirInformeAlumnos(Alumno[] alumnos) {
        System.out.print("Nombre" + "grupo");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.nombre + "\t" + alumno.grupo);
        }
    }

}

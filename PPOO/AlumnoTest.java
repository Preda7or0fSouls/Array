package PPOO;

import PPOO.Alumno;

public class AlumnoTest {
    public static void main(String[] args) {
        Alumno a1,a2,a3,a4;


        a1 = new Alumno (1,"Jose");
        a2 = new Alumno (2,"Joan","1B");
        a3 = new Alumno (3,"Juan","6F");
        a4 = new Alumno (4,"Paco");

        a1.preguntarDuda();
        Alumno [] lista = {a1,a2,a3,a4;}
        
        Alumno.ImprimirInforme();
        Alumno.ImprimirInformeAlumnos(lista);


    }
}
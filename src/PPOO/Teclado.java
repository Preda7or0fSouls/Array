/*Crea una clase teclado con los siguientes atributos privados:
Color.
Numero de teclas.
Conectividad: Indica si el teclado tiene cable o es inalámbrico.
Idioma: Representado por dos letras que marcan el código del país.
Formato: Puede tomar los valores compacto o extendido.
Métodos:
Crea getters y setters apropiados teniendo en cuenta que una vez creado un teclado
no se pueden modificar sus atributos. Se pueden leer.
Crea también un contador que cuente la cantidad de teclados que se han añadido al sistema.

Crea también una clase ordenador con los siguientes atributos privados:
Formato: Puede tomar los valores sobremesa o portátil.
Color.
Teclado: UN objeto de la clase anterior.
Métodos:
Crea getters y setters apropiados teniendo en cuenta que solo el teclado puede ser
modificado después de crear el ordenador. Se pueden leer.

Constructores:
Uno sin parámetros con valores por defecto.
Otro con valores específicos para cada atributo.

Extra:
En la clase ordenador crear un método conectar, que recibe como parámetro otro ordenador. De manera que un ordenador puede
estar conectado a otro.*/
public class Teclado {


    private String color;
    private  int numTeclas;
    private String conectividad;
    private String idioma;

    private  String formato;

    private static  int acc;



    public void setColor(String color) {
        this.color = color;
    }
    public int getNumTeclas() {
        return numTeclas;
    }
    public String getIdioma() {
        return idioma;
    }
    public String getFormato() {
        return formato;
    }

    public Teclado() {
        this.color =
    }
    public  static  void Acumulador(){
        acc++;
    }


}
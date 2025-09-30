package Laboral;

public class Persona {

    public String nombre;
    public String dni;
    public char sexo;

    /*
    * Constructor Persona
    * */

    public Persona(char sexo, String dni, String nombre) {
        this.sexo = sexo;
        this.dni = dni;
        this.nombre = nombre;
    }

    public Persona(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void Imprime (){
        System.out.println(nombre+", "+dni);
    }
}

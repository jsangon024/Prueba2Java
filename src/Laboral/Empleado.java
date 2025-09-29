package Laboral;

public class Empleado extends Persona {

    private int categoria;
    public int anyos;




    public Empleado(char sexo, String dni, String nombre) {
        super(sexo, dni, nombre);
        categoria=1;
        anyos=0;
    }

    public Empleado(char sexo, String dni, String nombre, int categoria, int anyos) throws DatosNoCorrectosException {
        super(sexo, dni, nombre);
        if(1<=categoria && categoria<=10){
            this.categoria= categoria;
        } else {
            throw new DatosNoCorrectosException("La categoría debe estar entre 1 y 10");
        }
        this.anyos=anyos;
    }


    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        if(1<=categoria && categoria<=10){
            this.categoria= categoria;
        } else {
            throw new DatosNoCorrectosException("La categoría debe estar entre 1 y 10");
        }
    }

    public void incrAnyo (){
        anyos++;
    }


    public void imprime() {
        System.out.println("Empleado:" +
                "anyos=" + anyos +
                ", categoria=" + categoria +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo);
    }
}

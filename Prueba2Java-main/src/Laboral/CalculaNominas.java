package Laboral;


import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class
CalculaNominas {

    public static void main(String[] args) {

        FileWriter fw= null;
        BufferedWriter bw= null;
        FileReader fr= null;
        String nombre= "empleados.txt";
        Empleado jc= new Empleado('M',"32000032G","James Cosling",4,7);
        Empleado al= new Empleado('F',"32000031R","Ada Cosling");

        try {
            fw = new FileWriter(nombre);
            bw = new BufferedWriter(fw);


            bw.write(jc.dni+", "+jc.nombre+", "+jc.sexo+", "+jc.getCategoria()+", "+jc.anyos+"\n");
            bw.write(al.dni+", "+al.nombre+", "+al.sexo+", "+al.getCategoria()+", "+al.anyos+"\n");
                bw.flush();



        } catch (IOException ex) {
            System.err.println("Se produjo un abrir o escribir en el fichero "+nombre);
        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                System.err.println("Error al cerrar el fichero");
            }
        }

        /*escribe(jc);
        escribe(al);*/

        al.incrAnyo();
        jc.setCategoria(9);

        /*escribe(jc);
        escribe(al);*/

        try {
            fw = new FileWriter(nombre); // Creo el stream que abre el fichero especificado
            bw = new BufferedWriter(fw);//Lo envuelvo para añadirle un búfer


            bw.write(jc.dni+", "+jc.nombre+", "+jc.sexo+", "+jc.getCategoria()+", "+jc.anyos+"\n");
            bw.write(al.dni+", "+al.nombre+", "+al.sexo+", "+al.getCategoria()+", "+al.anyos+"\n");
            bw.flush();



        } catch (IOException ex) {
            System.err.println("Se produjo un abrir o escribir en el fichero "+nombre);
        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                System.err.println("Error al cerrar el fichero");
            }
        }


    }

    private static void escribe(Empleado empleado){
        empleado.imprime();
        System.out.println("Sueldo: "+Nomina.sueldo(empleado));
    }

}

package Laboral;

public class Nomina {

    private static final int[] SUELDO_BASE ={50000,70000,90000,110000,130000,150000,170000,190000,210000,230000};

    public static double sueldo(Empleado empleado){
        int categoriaBase= empleado.getCategoria()-1;
        return SUELDO_BASE[categoriaBase]+(5000* empleado.anyos);
    }
}

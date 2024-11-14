package practica_09;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList <Empleado> empleados = new ArrayList<>();

        // Agregar empleados
        empleados.add(new Empleado(200000));
        empleados.add(new EmpleadoTiempoCompleto(150000));
        empleados.add(new EmpleadoMedioTiempo(100000));

        // Calcular y mostrar detalles y bonos para cada empleado
        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();
        }
        System.out.println("\n");
        // Calcular y mostrar bonos para cada empleado con parametros
        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getClass().getSimpleName());
            System.out.println("Bono estandar: ");
            empleado.calcularBono();
            System.out.println("Bono ajustado por rendimiento (1.5): ");
            empleado.calcularBono(1.5);
            System.out.println("\n");
        }

    }
}

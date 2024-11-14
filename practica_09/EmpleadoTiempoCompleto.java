package practica_09;

// Clase EmpleadoTiempoCompleto que hereda de la clase Empleado

public class EmpleadoTiempoCompleto extends Empleado{
    
    // Constructor que hereda el salario anual del padre
    public EmpleadoTiempoCompleto(double salarioAnual) {
        super(salarioAnual);
    }

    @Override
    public void calcularBono(){
        //devolver bono de 20 % sin parametros
        // Calcula y muestra el bono de 20% del salario anual del empleado tiempo completo
        double bono = getSalarioAnual() * 0.20;
        System.out.println("El bono es: " + bono);
    }

    public void calcularBono(double rendimiento){
        double bono = getSalarioAnual()*0.20*rendimiento;
        System.out.println("El bono es: " + bono);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado de Tiempo Completo. Salario anual: " + getSalarioAnual());
    }

}

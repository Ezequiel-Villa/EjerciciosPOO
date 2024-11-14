package practica_09;

class EmpleadoMedioTiempo extends Empleado {
    //constructor 
    public EmpleadoMedioTiempo(double salarioAnual) {
        super(salarioAnual);
    }
    @Override
    public void calcularBono() {
        double bono = getSalarioAnual() * 0.10;
        System.out.println("El bono es: " + bono);
    }
    
    public void calcularBono(double rendimiento){
        double bono = getSalarioAnual() * 0.10*rendimiento;
        System.out.println("El bono es: " + bono);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado de Medio Tiempo. Salario anual: " + getSalarioAnual());
    }

}

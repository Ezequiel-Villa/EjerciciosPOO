package practica_09;

public class Empleado {
    private double salarioAnual;

    // Constructor con salario anual
    public Empleado(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }
    

    public void calcularBono(){
        double bono = salarioAnual * 0.05;
        System.out.println("El bono del empleado es: " + bono);
    }

    public void calcularBono(double porcentaje){
        double bono = salarioAnual * (porcentaje / 100);
        System.out.println("El bono del empleado es: " + bono);
    }

    public void calcularBono(double porcentaje, double rendimiento){
        double bono = salarioAnual * (porcentaje / 100) * rendimiento;
        System.out.println("El bono del empleado es: " + bono);
    }

    public void mostrarDetalles(){
        System.out.println("Salario anual: " + salarioAnual);
        //calcularBono();
    }


    public double getSalarioAnual() {
        return salarioAnual;
    }


    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

}

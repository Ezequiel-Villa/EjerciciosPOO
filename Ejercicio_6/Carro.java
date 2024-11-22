package Ejercicio_6;

class Carro extends Vehiculo{
    @Override
    public void acelerar() {
        System.out.println("El carro acelera.");
    }
    @Override
    public void detener() {
        System.out.println("El carro frena.");
    }
}

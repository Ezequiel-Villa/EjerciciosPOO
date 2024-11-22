package Ejercicio_6;

public class Bicicleta extends Vehiculo{
    @Override
    void acelerar(){
        System.out.println("Acelerando la bicicleta...");
    }
    
    @Override
    void detener(){
        System.out.println("Frenando la bicicleta...");
    }
}

package Ejercicio_4;

class Circulo extends Figura{
    private double radio;
    //Metodo constrructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Metodo para calcular el area del circulo
    @Override
    double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
}

package Ejercicio_3;

public class Gato extends Animal {
    private int vidas;
    public Gato(String name, int edad, int vidas ){
        super(name, edad);
        this.vidas = vidas;
    }
    public int getVidas() {
        return vidas;
    }
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public void hacerRuido(){
        System.out.println("El gato esta maullando");
    }
    @Override
    public void hacerRuido(int volumen){
        System.out.println("El gato está maullando con un volumen de: " + volumen);
    }
    @Override
    public void hacerRuido(String tono, float duracion){
        System.out.println("El gato está maullando con un tono de: " + tono + " durante: " + duracion + " segundos");
    }

}

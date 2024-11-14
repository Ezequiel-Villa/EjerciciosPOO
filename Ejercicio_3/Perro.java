package Ejercicio_3;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerRuido(){
        System.out.println("El perro esta ladrando");
    }

    @Override
    public void hacerRuido(int volumen) {
        System.out.println("El perro esta ladrando con volumen " + volumen);
    }
    
    @Override
    public void hacerRuido(String tono, float duracion) {
        System.out.println("El perro esta ladrando con tono " + tono + " durante " + duracion + " segundos");
    }

}

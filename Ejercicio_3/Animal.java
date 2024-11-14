package Ejercicio_3;

public class Animal {
    private String nombre;
    private int edad;

    // Constructor con nombre y edad
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal(){
        this.nombre= " ";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void hacerRuido(){
        System.out.println("El animal " + this.nombre + " está haciendo ruido.");
    }

    public void hacerRuido(int volumen){
        System.out.println("El animal " + this.nombre + " está haciendo ruido de volumen " + volumen);
    }

    public void hacerRuido(String tono, float duracion){
        System.out.println("El animal " + this.nombre + " está haciendo ruido de tono " + tono + " durante " + duracion + " segundos.");
    }

    
}

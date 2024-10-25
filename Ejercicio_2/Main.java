//package Ejercicio_2;
public class Main {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.nombre = "Ezequiel";
        persona.mostrarNombre();

        //persona.edad = "21";// No se puede asiganr por que el metodo es privado
        persona.setEdad(21);
        System.out.println("Tu edad es: "+ persona.getEdad());
        //persona.mostrarEdad();//no se ejecuta por que le metodo es privado
        persona.direccion = "Calle 123";
        persona.mostrarDireccion();
        persona.telefono = "678901234";
        persona.mostrarTelefono();

    }
}

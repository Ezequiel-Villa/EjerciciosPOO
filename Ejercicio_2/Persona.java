//package Ejercicio_2;
public class Persona {
    public String nombre;   //atributos
    private int edad;
    protected String direccion;
    String telefono;

    public void mostrarNombre(){// modificador de acceso publico
        System.out.println("Nombre: " + nombre);
    }
    private void mostrarEdad(){//modificador de acceso privado
        System.out.println("Edad: " + edad);
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad>=0)
            this.edad = edad;
        else 
            System.out.println("Edad no válida. Debe ser un número entero positivo.");
    }
    protected void mostrarDireccion(){//modificador de acceso protegido
        System.out.println("Dirección: " + direccion);
    }

    void mostrarTelefono(){   //mpodificador de acceso default
        System.out.println("Teléfono: " + telefono);
    }


}
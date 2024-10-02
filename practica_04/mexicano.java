package practica_04;

import java.util.Scanner;
import java.util.Random;

public class mexicano {
    String nombre;
    String curp;
    String rfc;

    // Constructor vacío
    public mexicano() {}

    // Constructor con nombre
    public mexicano(String nombre) {
        this.nombre = nombre;
    }

    // Método para generar CURP
    public void generarCurp(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento, String sexo, String estado) {
        curp = apellidoPaterno.substring(0, 2).toUpperCase() +
               apellidoMaterno.substring(0, 1).toUpperCase() +
               nombre.substring(0, 1).toUpperCase() +
               fechaNacimiento.substring(2, 4) +  // Años
               fechaNacimiento.substring(5, 7) +  // Mes
               fechaNacimiento.substring(8) +     // Día
               sexo.toUpperCase() +
               estado.toUpperCase() +
               generarConsonantes(apellidoPaterno, apellidoMaterno, nombre) +
               generarCurpAleatorio();
    }

    // Método para generar RFC
    public void generarRfc(String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento) {
        rfc = apellidoPaterno.substring(0, 2).toUpperCase() +
              apellidoMaterno.substring(0, 1).toUpperCase() +
              nombre.substring(0, 1).toUpperCase() +
              fechaNacimiento.substring(2, 4) +  // Años
              fechaNacimiento.substring(5, 7) +  // Mes
              fechaNacimiento.substring(8) +     // Día
              generarRfcAleatorio();
    }

    // Método para generar las consonantes internas para CURP
    private String generarConsonantes(String apellidoPaterno, String apellidoMaterno, String nombre) {
        return obtenerPrimeraConsonante(apellidoPaterno) +
               obtenerPrimeraConsonante(apellidoMaterno) +
               obtenerPrimeraConsonante(nombre);
    }

    // Método para obtener la primera consonante interna de un nombre o apellido
    private String obtenerPrimeraConsonante(String palabra) {
        for (int i = 1; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if ("BCDFGHJKLMNÑPQRSTVWXYZ".indexOf(Character.toUpperCase(letra)) != -1) {
                return String.valueOf(letra).toUpperCase();
            }
        }
        return "";
    }

    // Método para generar los últimos 2 caracteres del CURP aleatoriamente
    private String generarCurpAleatorio() {
        Random random = new Random();
        int numAleatorio = random.nextInt(90) + 10; // Genera número entre 10 y 99
        char letraAleatoria = (char) (random.nextInt(26) + 'A'); // Genera letra aleatoria
        return numAleatorio + String.valueOf(letraAleatoria);
    }

    // Método para generar los últimos 3 caracteres del RFC aleatoriamente
    private String generarRfcAleatorio() {
        Random random = new Random();
        int numAleatorio = random.nextInt(900) + 100; // Genera número entre 100 y 999
        char letraAleatoria1 = (char) (random.nextInt(26) + 'A');
        char letraAleatoria2 = (char) (random.nextInt(26) + 'A');
        return letraAleatoria1 + String.valueOf(letraAleatoria2) + numAleatorio;
    }

    // Método para mostrar la información del objeto
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("CURP: " + (curp != null ? curp : "No generado"));
        System.out.println("RFC: " + (rfc != null ? rfc : "No generado"));
        System.out.println();
    }

    // Método para pedir información al usuario
    public static void pedirDatosYGenerar(mexicano mexicano, boolean generarCurp, boolean generarRfc) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido paterno:");
        String apellidoPaterno = scanner.nextLine();
        System.out.println("Ingrese el apellido materno:");
        String apellidoMaterno = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD):");
        String fechaNacimiento = scanner.nextLine();
        System.out.println("Ingrese el sexo (H/M):");
        String sexo = scanner.nextLine();
        System.out.println("Ingrese el estado (Abreviación de 2 letras):");
        String estado = scanner.nextLine();

        mexicano.nombre = nombre + " " + apellidoPaterno + " " + apellidoMaterno;

        if (generarCurp) {
            mexicano.generarCurp(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, sexo, estado);
        }
        if (generarRfc) {
            mexicano.generarRfc(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Objeto 1: Solo generar CURP
        mexicano mexicano1 = new mexicano();
        pedirDatosYGenerar(mexicano1, true, false);
        mexicano1.mostrarInfo();

        // Objeto 2: Solo generar RFC
        mexicano mexicano2 = new mexicano();
        pedirDatosYGenerar(mexicano2, false, true);
        mexicano2.mostrarInfo();

        // Objeto 3: Generar CURP y RFC
        mexicano mexicano3 = new mexicano();
        pedirDatosYGenerar(mexicano3, true, true);
        mexicano3.mostrarInfo();
    }
}
package practica_04;

import java.util.Scanner;
import java.util.Random;

class Mexicano {

    // Método para generar el CURP
    public static String generarCURP(String nombre, String fechaNacimiento, String sexo, String entidad) {
        String curp = "";
        String[] nombreDividido = nombre.split(" ");
        String primerApellido = nombreDividido[0];
        String segundoApellido = nombreDividido[1];
        String primerNombre = nombreDividido[2];

        // Reglas básicas para la construcción del CURP
        curp += primerApellido.charAt(0);
        curp += primerVocalInterna(primerApellido);
        curp += segundoApellido.charAt(0);
        curp += primerNombre.charAt(0);
        curp += fechaNacimiento.substring(2, 4); // Año
        curp += fechaNacimiento.substring(5, 7); // Mes
        curp += fechaNacimiento.substring(8, 10); // Día
        curp += sexo;
        curp += entidad;
        curp += primeraConsonanteInterna(primerApellido);
        curp += primeraConsonanteInterna(segundoApellido);
        curp += primeraConsonanteInterna(primerNombre);

        // Generar los últimos 2 caracteres aleatorios
        curp += generarCaracteresAleatorios(2);

        return curp.toUpperCase();
    }

    // Método para generar el RFC
    public static String generarRFC(String nombre, String fechaNacimiento) {
        String rfc = "";
        String[] nombreDividido = nombre.split(" ");
        String primerApellido = nombreDividido[0];
        String segundoApellido = nombreDividido[1];
        String primerNombre = nombreDividido[2];

        // Reglas básicas para la construcción del RFC
        rfc += primerApellido.charAt(0);
        rfc += primerVocalInterna(primerApellido);
        rfc += segundoApellido.charAt(0);
        rfc += primerNombre.charAt(0);
        rfc += fechaNacimiento.substring(2, 4); // Año
        rfc += fechaNacimiento.substring(5, 7); // Mes
        rfc += fechaNacimiento.substring(8, 10); // Día

        // Generar los últimos 3 caracteres aleatorios
        rfc += generarCaracteresAleatorios(3);

        return rfc.toUpperCase();
    }

    // Método para obtener la primera vocal interna de una cadena
    private static char primerVocalInterna(String cadena) {
        for (int i = 1; i < cadena.length(); i++) {
            if ("AEIOUaeiou".indexOf(cadena.charAt(i)) != -1) {
                return cadena.charAt(i);
            }
        }
        return 'X';
    }

    // Método para obtener la primera consonante interna de una cadena
    private static char primeraConsonanteInterna(String cadena) {
        for (int i = 1; i < cadena.length(); i++) {
            if ("BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(cadena.charAt(i)) != -1) {
                return cadena.charAt(i);
            }
        }
        return 'X';
    }

    // Método para generar caracteres aleatorios
    private static String generarCaracteresAleatorios(int cantidad) {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder aleatorio = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            aleatorio.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return aleatorio.toString();
    }

    // Método para mostrar los datos de la persona
    public static void mostrarDatos(String nombre, String curp, String rfc) {
        System.out.println("Nombre: " + nombre);
        if (curp != null) {
            System.out.println("CURP: " + curp);
        }
        if (rfc != null) {
            System.out.println("RFC: " + rfc);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            // Mostrar el menú de opciones
            System.out.println("\n---- MENÚ ----");
            System.out.println("1. Generar CURP");
            System.out.println("2. Generar RFC");
            System.out.println("3. Generar ambos (CURP y RFC)");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1: // Generar CURP
                    System.out.println("\nIntroduce el nombre completo para el CURP:");
                    String nombre1 = scanner.nextLine();
                    System.out.println("Fecha de nacimiento (YYYY-MM-DD):");
                    String fechaNacimiento1 = scanner.nextLine();
                    System.out.println("Sexo (H/M):");
                    String sexo1 = scanner.nextLine();
                    System.out.println("Entidad federativa (Ej: DF):");
                    String entidad1 = scanner.nextLine();
                    String curp1 = generarCURP(nombre1, fechaNacimiento1, sexo1, entidad1);
                    mostrarDatos(nombre1, curp1, null); // Solo mostramos el CURP
                    break;

                case 2: // Generar RFC
                    System.out.println("\nIntroduce el nombre completo para el RFC:");
                    String nombre2 = scanner.nextLine();
                    System.out.println("Fecha de nacimiento (YYYY-MM-DD):");
                    String fechaNacimiento2 = scanner.nextLine();
                    String rfc2 = generarRFC(nombre2, fechaNacimiento2);
                    mostrarDatos(nombre2, null, rfc2); // Solo mostramos el RFC
                    break;

                case 3: // Generar CURP y RFC
                    System.out.println("\nIntroduce el nombre completo para ambos CURP y RFC:");
                    String nombre3 = scanner.nextLine();
                    System.out.println("Fecha de nacimiento (YYYY-MM-DD):");
                    String fechaNacimiento3 = scanner.nextLine();
                    System.out.println("Sexo (H/M):");
                    String sexo3 = scanner.nextLine();
                    System.out.println("Entidad federativa (Ej: DF):");
                    String entidad3 = scanner.nextLine();
                    String curp3 = generarCURP(nombre3, fechaNacimiento3, sexo3, entidad3);
                    String rfc3 = generarRFC(nombre3, fechaNacimiento3);
                    mostrarDatos(nombre3, curp3, rfc3); // Mostramos ambos, CURP y RFC
                    break;

                case 4: // Salir
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}
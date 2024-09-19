package Practica_02;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tam = 5;
        float[] calif = new float[tam];
        String op;
        boolean salir = false;

        do {
            mostrarMenu();
            System.out.println("Ingresa una opcion");
            op = leer.nextLine();

            switch (op) {
                case "1":
                    System.out.println("Has elegido la opcion 1");
                    capturarNombre();
                    capturarCalif(tam, calif);
                    break;
                case "2":
                    System.out.println("Has elegido la opcion 2");
                    mostrarCalif(calif);
                    mostrarPromedio(calif);
                    break;
                case "3":
                    System.out.println("Has elegido la opcion 3");
                    mostrarCalif(calif);
                    calificacionBaja(calif);
                    break;
                case "4":
                    System.out.println("Has elegido la opcion 4");
                    mostrarCalif(calif);
                    calificacionAlta(calif);
                    break;
                case "5":
                    System.out.println("Gracias por utilizar este programa :)");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (!salir);
    }

    public static void mostrarMenu() {      //Mostrar MENU
        System.out.println("Menu");
        System.out.println("1. Captura de nombres y calificaciones");
        System.out.println("2. Imprimir calificaciones y promedio de calificaciones");
        System.out.println("3. Imprimir calificaciones y calificacion mas baja");
        System.out.println("4. Imprimir calificaciones y calificacion mas alta");
        System.out.println("5. Salir");
    }

    public static void capturarNombre() {    //Captura de nombre
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa el nombre del estudiante");
        nombre = leer.nextLine();
        System.out.println("Nombre capturado: " + nombre);
    }

    public static void capturarCalif(int tam, float[] calif) {  //Captura de calificaciones
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingresa la calificacion " + (i + 1));
            calif[i] = leer.nextFloat();
            if (calif[i] < 0 || calif[i] > 100) {
                System.out.println("Calificacion no valida. Ingresa una calificacion entre 0 y 100");
                i--; // Volver a pedir la calificación si es inválida
            }
        }
    }

    public static void mostrarCalif(float[] calif) {     //mostrar calificacion
        System.out.println("Calificaciones:");
        for (int i = 0; i < calif.length; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + calif[i]);
        }
    }

    public static void mostrarPromedio(float[] calif) {   //Mostrar promedio
        float suma = 0;
        for (float c : calif) {
            suma += c;
        }
        float promedio = suma / calif.length;
        System.out.println("Promedio de calificaciones: " + promedio);
    }

    public static void calificacionBaja(float[] calif) {  //Encontrar calififcacion mas baja
        float min = calif[0];
        for (int i = 1; i < calif.length; i++) {
            if (calif[i] < min) {
                min = calif[i];
            }
        }
        System.out.println("La calificacion mas baja es: " + min);
    }

    public static void calificacionAlta(float[] calif) {    //Encontrar calificacion mas baja
        float max = calif[0];
        for (int i = 1; i < calif.length; i++) {
            if (calif[i] > max) {
                max = calif[i];
            }
        }
        System.out.println("La calificacion mas alta es: " + max);
    }
}



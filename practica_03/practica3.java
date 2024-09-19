package practica_03;

import java.util.Scanner;

public class practica3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\nMenú Para calcular Estadisticos:");
            System.out.println("1. Ingresar números");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ingresarNumeros(leer); // Llamada al método que procesa los números
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción correcta.");
                    break;
            }
        } while (opcion != 2);
        leer.close(); // Cerrar el scanner
        
    }

    // Método para ingresar los números y calcular las estadísticas
    public static void ingresarNumeros(Scanner leer) {
        int contador = 0;
        int suma = 0;
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Ingresa una serie de números. Para finalizar, ingresa -1.");
        System.out.println("Se calcularan: ");
        System.out.println("El numero total de elementos");
        System.out.println("La suma de los elementos");
        System.out.println("El promedio de los elementos ");
        System.out.println("El numero mas grande");
        System.out.println("El numero mas pequeño");

        while (true) {
            System.out.print("Número: ");
            numero = leer.nextInt();

            // Si el número es -1, se sale del bucle
            if (numero == -1) {
                break;
            }

            // Actualiza contador y suma
            contador++;
            suma += numero;

            // Actualiza el máximo y el mínimo
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }

        // Comprueba si se ingresaron números válidos
        if (contador > 0) {
            // Calcula el promedio
            double promedio = (double) suma / contador;

            // Muestra los resultados
            System.out.println("Estadísticas:");
            System.out.println("Número total de elementos: " + contador);
            System.out.println("Suma de los elementos: " + suma);
            System.out.println("Promedio de los elementos: " + promedio);
            System.out.println("Número más grande: " + maximo);
            System.out.println("Número más pequeño: " + minimo);
        } else {
            System.out.println("No se ingresaron números.");
        }
    }
}



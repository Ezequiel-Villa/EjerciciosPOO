package practica_07;

import java.util.Scanner;

public class OperacionesBancarias { //En esta clase se muestra el menu de opciones disponibles a realizar
    private static Scanner scanner = new Scanner(System.in);
    private static Banco banco = new Banco();

    public static void main(String[] args) {  // Este es el main con las opciones
        int opcion;
        do {
            System.out.println("Bienvenido al Banco. Seleccione una opción:");
            System.out.println("1. Crear nueva cuenta");
            System.out.println("2. Acceder a cuenta existente");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {   
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    accederCuenta();
                    break;
                case 3:
                    System.out.println("Gracias por usar el banco.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }

    private static void crearCuenta() { // En este metodo se piden los datos para crear una cuenta
        System.out.print("Ingrese el nombre del titular: ");
        String nombreTitular = scanner.nextLine();
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese la CLABE interbancaria: ");
        String clabeInterbancaria = scanner.nextLine();
        System.out.print("Cree un PIN de 4 dígitos: ");
        String pin = scanner.nextLine();

        banco.registrarCuenta(nombreTitular, tipoCuenta, saldoInicial, numeroCuenta, clabeInterbancaria, pin);
    }

    private static void accederCuenta() {    //Metodo para acceder a la cuenta y realizar operaciones
        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese su PIN: ");
        String pin = scanner.nextLine();

        Cuenta cuenta = banco.accederCuenta(numeroCuenta, pin);
        if (cuenta != null) {
            int opcion;
            do {
                System.out.println("Seleccione una operación:");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Retirar");
                System.out.println("4. Salir");
                System.out.print("Opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
                        break;
                    case 2:
                        System.out.print("Ingrese el monto a depositar: ");
                        double montoDeposito = scanner.nextDouble();
                        cuenta.depositar(montoDeposito);
                        break;
                    case 3:
                        System.out.print("Ingrese el monto a retirar: ");
                        double montoRetiro = scanner.nextDouble();
                        cuenta.retirar(montoRetiro);
                        break;
                    case 4:
                        System.out.println("Saliendo de la cuenta.");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                }
            } while (opcion != 4);
        }
    }
}



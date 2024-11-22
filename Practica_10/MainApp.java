package Practica_10;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PrepRobot prepBot = new PrepRobot("Helper");
        ChefRobot breakfastChef = new ChefRobot("Breakfast Chef", "Chilaquiles");
        ChefRobot lunchChef = new ChefRobot("Lunch Chef", "Spaghetti");
        ChefRobot dinnerChef = new ChefRobot("Dinner Chef", "Tacos");
        WaiterRobot waiterBot = new WaiterRobot("Waiter", "Platillo");

        int option = 0;

        do {
            displayMenu();
            System.out.print("Opcion: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    prepBot.prepare();
                    break;
                case 2:
                    if (!RobotCore.getAreIngredientsReady()) {
                        System.out.println("Error: los ingredientes deben estar preparados primero.");
                        break;
                    }
                    displayChefMenu();
                    System.out.print("Opcion: ");
                    int chefOption = input.nextInt();
                    switch (chefOption) {
                        case 1:
                            breakfastChef.cookDish();
                            break;
                        case 2:
                            lunchChef.cookDish();
                            break;
                        case 3:
                            dinnerChef.cookDish();
                            break;
                        default:
                            System.out.println("Opcion invalida.");
                            break;
                    }
                    break;
                case 3:
                    if (!RobotCore.getIsCooked()) {
                        System.out.println("Error: Nos e puede servir un plato que no esta cocinado.");
                        break;
                    }
                    waiterBot.serveDish();
                    if (RobotCore.getIsServed()) {
                        System.out.println("¡Hurra! El plato estaba delicioso");
                    }

                    // Reset cycle for another round
                    RobotCore.setAreIngredientsReady(false);
                    RobotCore.setIsCooked(false);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (option != 4);
        input.close();
    }

    public static void displayMenu() {
        System.out.println("\nMenu Principal. Elige que quieres hacer:");
        System.out.println("1. Preparar ingredientes");
        System.out.println("2. Cocinar");
        System.out.println("3. Servir");
        System.out.println("4. Salir");
    }

    public static void displayChefMenu() {
        System.out.println("\nSelecciona el tipo de comida:");
        System.out.println("1. Desayuno");
        System.out.println("2. Comida");
        System.out.println("3. Cena");
    }
}

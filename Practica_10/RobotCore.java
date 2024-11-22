package Practica_10;

public abstract class RobotCore implements RobotActions {
    private static boolean isCooked = false;
    private static boolean isServed = false;
    private String robotName;
    private static boolean areIngredientsReady = false;

    public RobotCore(String robotName) {
        this.robotName = robotName;
    }

    public static boolean getIsCooked() {
        return isCooked;
    }

    public static void setIsCooked(boolean cooked) {
        RobotCore.isCooked = cooked;
    }

    public String getRobotName() {
        return robotName;
    }

    public static boolean getAreIngredientsReady() {
        return areIngredientsReady;
    }

    public static void setAreIngredientsReady(boolean ready) {
        RobotCore.areIngredientsReady = ready;
    }

    public static boolean getIsServed() {
        return isServed;
    }

    public static void setIsServed(boolean served) {
        RobotCore.isServed = served;
    }

    @Override
    public void prepare() {
        System.out.println("ERROR: El robot " + robotName + " no puede preparar ingredientes.");
    }

    @Override
    public void cookDish() {
        System.out.println("ERROR: El robot " + robotName + " no puede cocinar.");
    }

    @Override
    public void serveDish() {
        System.out.println("ERROR: El robot " + robotName + " no puede servir.");
    }
}


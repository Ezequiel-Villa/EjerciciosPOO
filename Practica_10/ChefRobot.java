package Practica_10;

public class ChefRobot extends RobotCore {
    private String dishType;

    public ChefRobot(String robotName, String dishType) {
        super(robotName);
        this.dishType = dishType;
    }

    @Override
    public void cookDish() {
        if (!RobotCore.getAreIngredientsReady()) {
            System.out.println("ERROR: El robot " + getRobotName() + " no puede cocinar sin los ingredientes.");
            return;
        }
        System.out.println("El robot " + getRobotName() + " está cocinando un " + dishType + ".");
        RobotCore.setIsCooked(true);
    }

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    @Override
    public void serveDish() {
        System.out.println("El robot " + getRobotName() + " puede servir platillos básicos.");
    }
}
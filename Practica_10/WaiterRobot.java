package Practica_10;

public class WaiterRobot extends ChefRobot {
    public WaiterRobot(String robotName, String dishType) {
        super(robotName, dishType);
    }

    @Override
    public void serveDish() {
        if (!RobotCore.getIsCooked()) {
            System.out.println("ERROR: El robot " + getRobotName() + " no puede servir sin cocinar.");
            return;
        }
        System.out.println("El robot " + getRobotName() + " está sirviendo un " + getDishType() + ".");
        RobotCore.setIsServed(true);
    }
}
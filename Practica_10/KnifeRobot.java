package Practica_10;

class PrepRobot extends RobotCore {
    public PrepRobot(String robotName) {
        super(robotName);
    }

    @Override
    public void prepare() {
        System.out.println("El robot " + getRobotName() + " está preparando los ingredientes.");
        RobotCore.setAreIngredientsReady(true);
    }
}


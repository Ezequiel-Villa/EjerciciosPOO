package Ejercicio_5;
//clase que hereda e implementa
class Delfin extends Animal implements Nadador {
    @Override
    void emitirSonido() {
        System.out.println("El delfín emite un sonido agudo");
    }
    @Override
    public void nadar() {
        System.out.println("El delfín esta nadando");
    }
}

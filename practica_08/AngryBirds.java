//clase logica
public class AngryBirds {
    public static void main(String[] args) {
        // Crear instancias de cada subclase de Bird
        Bird genericBird = new Bird("Generico", 100,10,"Pajaro generico","general");
        Red redBird = new Red();
        Blue blueBird = new Blue();
        Chuk chukBird = new Chuk();

        // Probar métodos de la clase base Bird
        System.out.println("=== Probando métodos de la clase base Bird ===");
        genericBird.volar();
        genericBird.atacar(chukBird);
        genericBird.usarHabilidadEspecial();

        // Probar métodos de Red (usando tanto métodos heredados como específicos)
        System.out.println("\n=== Probando métodos de Red ===");
        redBird.volar();        // Método heredado
        redBird.gritar();   // Método heredado
        redBird.cargar();  // Método específico de Red

        // Probar métodos de Blue (usando tanto métodos heredados como específicos)
        System.out.println("\n=== Probando métodos de Blue ===");
        blueBird.recibirDanio(10);          // Método heredado
        blueBird.curar(20);   // Método heredado
        blueBird.dividir(); // Método específico de Blue

        // Probar métodos de Chuk (usando tanto métodos heredados como específicos)
        System.out.println("\n=== Probando métodos de Chuk ===");
        chukBird.gritar();          // Método heredado
        chukBird.atacar(redBird);   // Método heredado
        chukBird.acelerar();      // Método específico de Chuk
    }
}


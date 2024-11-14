package Ejercicio_3;

public class Main {
    public static void main(String[] args){
        Perro perro1 = new Perro("Freezer",11,"doberman");
        Gato gato1 = new Gato("goku",5,7);
        //imprimir nombre, edad y raza

        System.out.println("Nombre del perro: " + perro1.getNombre());
        System.out.println("Edad: " + perro1.getEdad());
        System.out.println("Raza: " + perro1.getRaza());

        System.out.println("Nombre del gato: " + gato1.getNombre());
        System.out.println("Edad: " + gato1.getEdad());    
        System.out.println("Vidas: " + gato1.getVidas());  
        
        perro1.hacerRuido();
        gato1.hacerRuido();
        perro1.hacerRuido(5);
        gato1.hacerRuido(4);
        perro1.hacerRuido("Re",10.3f);
        gato1.hacerRuido("Do", 2.5f);

    }

}

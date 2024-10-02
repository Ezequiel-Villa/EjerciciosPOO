package prueba;

public class ciclot {
    public static void main (String[] args){
        // imprimir un trinagulo de asteriscos *
        System.out.println("Trinagulo de asteriscos:");
        for (int i = 0; i <=9; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}

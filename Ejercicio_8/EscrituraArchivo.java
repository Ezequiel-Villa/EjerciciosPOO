import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraArchivo {
    public static void main(String[] args) {
        BufferedWriter escritor = null;
        try{
            File archivo = new File("C:\\Users\\Lenovo ThinkPad\\Desktop\\POO\\Ejercicio_8\\archivo.txt");    //abrir archivo en java
            escritor = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo ThinkPad\\Desktop\\POO\\Ejercicio_8\\archivo.txt"));
            escritor.write("Yo no edito porque no se editar ");
            escritor.newLine();
            escritor.write("Perro ");
            System.out.println("El archivo se ha escrito correctamente ");
        }catch(IOException e){
            System.out.println("Error al escribir en el archivo "+ e.getMessage());
        }finally{
            try {
                if (escritor!= null)escritor.close();
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo "+ e.getMessage());
            }
        }
    }
}

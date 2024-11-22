
import java.io.*;

public class LecturaArchivo{
    public static void main(String[] args) {
        BufferedReader lector = null;
        try{
            File archivo = new File("C:\\Users\\Lenovo ThinkPad\\Desktop\\POO\\Ejercicio_8\\archivo.txt");    //abrir archivo en java
            lector = new BufferedReader(new FileReader("C:\\Users\\Lenovo ThinkPad\\Desktop\\POO\\Ejercicio_8\\archivo.txt"));

            String linea;
            while((linea=lector.readLine())!=null){
                System.out.println(linea);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado"+ e.getMessage());
        }catch(IOException e) {
            System.out.println("Error al leer el archivo"+ e.getMessage());
        }finally {
            try{
                if(lector!=null)lector.close();
            }catch(IOException e){
                System.out.println("Error al cerrar el archivo"+ e.getMessage());
            }
        }
    }
}



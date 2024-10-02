package prueba;

import java.util.Scanner;

public class Libro { // Clase con mayúscula inicial
    String titulo;   //Atributos 
    String autor;
    int fechaPublicacion;
    int paginas;
    String editorial;
    
    // Constructor
    public Libro(){
        // Constructor vacío si no se desea asignar valores aún
    }

    // Constructor que recibe parámetros
    public Libro(String titulo, String autor, int fechaPublicacion, int paginas, String editorial){
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.paginas = paginas;
        this.editorial = editorial;
    }
    
    // Métodos   
    public void mostrarInfo(){
        //Mostrar la información del libro en pantalla
        System.out.println("Información del libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha de Publicación: " + fechaPublicacion);
        System.out.println("Número de Páginas: " + paginas);
        System.out.println("Editorial: " + editorial);
        System.out.println();
    }

    // Pedir información del libro al usuario
    public void pedirInfoLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título del libro:");
        titulo = scanner.nextLine();
        System.out.println("Ingrese el autor del libro:");
        autor = scanner.nextLine();
        System.out.println("Ingrese la fecha de publicación del libro:");
        fechaPublicacion = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer
        System.out.println("Ingrese el número de páginas del libro:");
        paginas = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer
        System.out.println("Ingrese la editorial del libro:");
        editorial = scanner.nextLine();
    }

    // Función principal
    public static void main(String[] args){
        Libro[] libros = new Libro[3];
        for (int i = 0; i < libros.length; i++) {
            libros[i] = new Libro();
            libros[i].pedirInfoLibro();
        }
        mostrarLibros(libros);
    }
    
    // Mostrar todos los libros ingresados
    public static void mostrarLibros(Libro[] libros){
        for(int i = 0; i < libros.length; i++){
            libros[i].mostrarInfo();
        }
    }
}


package Practica_05;

import java.util.ArrayList;
import java.util.Scanner;

//Crea un programa que gestione una lista de tareas pendientes. El programa debe permitir al usuario:
/*Agregar una nueva tarea.
Marcar una tarea como completada.
Eliminar una tarea.
Mostrar todas las tareas pendientes.
*/
public class Tarea {
    String tarea;
    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    String estado;
    
    public Tarea(String tarea, String estado) {
        this.tarea = tarea;
        this.estado = estado;
    }

    //Metodo agregar tareas manualmente
    public static void agregarTarea(ArrayList<Tarea> tareas, String tarea){
        tareas.add(new Tarea(tarea, "Pendiente"));
        System.out.println("Tarea agregada: " + tarea);

    }
    //Metodo para mostrar todas las tareas
    public static void mostrarTareas(ArrayList<Tarea> tareas){
        System.out.println("Tareas pendientes:");
        for(Tarea tarea : tareas){
            System.out.println("- " + tarea.tarea + " (" + tarea.estado + ")");
        }
    }
    //Metodo para marcar una tarea como completada
    public static void marcarComoCompletada(ArrayList<Tarea> tareas, int index){
        tareas.get(index).estado = "Completada";
        System.out.println("Tarea marcada como completada: " + tareas.get(index).tarea);
    }
    //Metodo para eliminar una tarea
    public static void eliminarTarea(ArrayList<Tarea> tareas, int index){
        System.out.println("Tarea eliminada: " + tareas.get(index).tarea);
        tareas.remove(index);
    }

    //Metodo para mostrar un menu
    public static void menu(ArrayList<Tarea> tareas, int index){
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar todas las tareas");
            System.out.println("5. Salir");
            System.out.print("Escoja una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la tarea a agregar: ");
                    leer.nextLine(); // Limpiar el buffer
                    String tareaAgregar = leer.nextLine();
                    agregarTarea(tareas, tareaAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el indice de la tarea a marcar como completada: ");
                    int indexMarcar = leer.nextInt();
                    marcarComoCompletada(tareas, indexMarcar);
                    break;
                case 3:
                    System.out.print("Ingrese el indice de la tarea a eliminar: ");
                    int indexEliminar = leer.nextInt();
                    eliminarTarea(tareas, indexEliminar);
                    break;
                case 4:
                    mostrarTareas(tareas);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default: System.out.println("Opcion incorrecta");
            }
        }while(opcion!=5);


    }
    public  static void main (String[] args){
        Scanner leer = new Scanner (System.in);
        ArrayList<Tarea> tareas = new ArrayList<>();
        //Agregar tareas
        tareas.add(new Tarea("Hacer la compra", "Pendiente"));
        tareas.add(new Tarea("Revisar el correo", "Pendiente"));
        tareas.add(new Tarea("Limpiar el baño", "Pendiente"));
        //Mostrar Menu
        menu(tareas, 0);
        /*//Agregar tareas manualmente
        agregarTarea(tareas, null);
        //Marcar una tarea como completada
        marcarComoCompletada(tareas, 0);
        //Eliminar una tarea
        eliminarTarea(tareas, 0);
        //Mostrar todas las tareas
        mostrarTareas(tareas);
        */
    }
}

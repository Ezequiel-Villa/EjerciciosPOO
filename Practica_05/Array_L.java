package Practica_05;

import java.util.ArrayList;

public class Array_L {
    public static void main(String[] args) {
        ArrayList<String> examen = new ArrayList<>();
          //tipo de dato |nombre 
        //Agregar
        examen.add("POO");
        examen.add("Pradigmas");
        examen.add("Redes");
        examen.add("Estructuras");
        examen.add("Analisis");
        examen.add("Ingenieria de requerimentos");
        examen.add("Documentacion");
 
        //Traer un dato en una posicion
        String examenp1= examen.get(0);
                                    //posicion
        //Eliminar una posicion
        examen.remove(1);

        //tamaño
        int size = examen.size();
        System.out.println(examen.size());
        // recorrer todos los elementos 
        for (String examenes : examen) {
            System.out.println(examenes);
        }
    }
   
}


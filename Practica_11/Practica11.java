package Practica_11;

import java.io.*;
import java.util.*;
public class Practica11 {

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        String archivoEntrada = "C:\\Users\\Lenovo ThinkPad\\Downloads\\proyecto11.csv";
        String archivoSalida = "C:\\Users\\Lenovo ThinkPad\\Desktop\\POO\\Practica_11\\datosAlumnos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null && contador < 3) {
                String[] datos = linea.split(",");
                if (datos.length < 8) {
                    throw new ExcepcionArchivoInvalido("El archivo no tiene suficientes datos en la línea " + (contador + 1));
                }
                Alumno alumno = new Alumno("Luis", datos[1]);
                Alumno alumno2 = new Alumno("jose", datos[3]);
                Alumno alumno3 = new Alumno("Maria", datos[5]);

                for (int i = 2; i < 9; i++) {
                    alumno.agregarCalificacion(Double.parseDouble(datos[i]));
                }
                alumno.calcularPromedio();
                alumnos.add(alumno);
                //contador++;
                for (int i = 4; i < 11; i++) {
                    alumno2.agregarCalificacion(Double.parseDouble(datos[i]));
                }
                alumno2.calcularPromedio();
                alumnos.add(alumno2);
                for (int i = 6; i < 13; i++) {
                    alumno3.agregarCalificacion(Double.parseDouble(datos[i]));
                }
                alumno3.calcularPromedio();
                alumnos.add(alumno3);
                contador++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato de número inválido en el archivo.");
            e.printStackTrace();
        } catch (ExcepcionArchivoInvalido e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado.");
            e.printStackTrace();
        }

        // Mostrar información de los alumnos
        for (Alumno alumno : alumnos) {
            System.out.println(alumno );
        }

        // Guardar datos en un archivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {
            for (Alumno alumno : alumnos) {
                bw.write(alumno.toString());
                bw.write("\n");
            }
            System.out.println("El archivo con la información de los alumnos ha sido generado.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de salida.");
            e.printStackTrace();
        }
    }
}
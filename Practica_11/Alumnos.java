package Practica_11;

import java.io.*;
import java.util.*;
class Alumno {
    private String nombre;
    private String matricula;
    private List<Double> calificaciones;
    private double promedio;

    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificaciones = new ArrayList<>();
        this.promedio = 0.0;
    }

    public void agregarCalificacion(double calificacion) {
        this.calificaciones.add(calificacion);
    }

    public void calcularPromedio() {
        if (calificaciones.isEmpty()) {
            throw new ArithmeticException("No se puede calcular el promedio sin calificaciones.");
        }
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        this.promedio = suma / calificaciones.size();
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", matricula='" + matricula + '\'' +
                ", calificaciones=" + calificaciones +
                ", promedio=" + Math.round(promedio)+
                '}';
    }
}

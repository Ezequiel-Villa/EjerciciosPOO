//Ejercicio 1 

import java.util.Scanner;

public class principal {
  public static void main(String[] args) {
    String texto = capturaTexto();
    mostrarTexto(texto);
    mostrarNumero();
    mostrarDecimal();
  }
  public static String capturaTexto(){
    System.out.println("Ingreasa tu texto: ");
    Scanner cadena = new Scanner(System.in);
    return cadena.next();
  }


  public static void mostrarTexto(String texto){
    System.out.println("Texto capturado: " + texto);
  }
  //Ingresar un numero y 
  public static int numero(){
    Scanner numero = new Scanner(System.in);
    System.out.println("Ingresa un numero: ");
    return numero.nextInt();
  }
  public static void mostrarNumero(){
    int num = numero();
    System.out.println("Numero ingresado: " + num);
  }
  //Ingresar un numero decimal y mostrarlo
  public static double decimal(){
    Scanner decimal = new Scanner(System.in);
    System.out.println("Ingresa un numero decimal: ");
    return decimal.nextDouble();
  }
  public static void mostrarDecimal(){
    double num = decimal();
    System.out.println("Numero decimal ingresado: " + num);
  }

}




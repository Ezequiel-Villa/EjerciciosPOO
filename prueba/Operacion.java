package prueba;
import java.util.Scanner;
public class Operacion {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos
    public void leerNumeros(){
        Scanner leer = new Scanner (System.in);
        //Solicitar los numeros al usuario
        System.out.println("Ingrese el primer numero:");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2 = leer.nextInt();
    }

    public void sumar(){
        suma=numero1+numero2;
    }
    public void restar(){
        resta= numero1-numero2;
    }
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    public void dividir(){
        division= numero1/numero2;
    }
    public void mostrarResultados(){
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es:"+ resta);
        System.out.println("La multiplicacion es: "+ multiplicacion);
        System.out.println("La division es: "+ division);
        
    }
    public static void main(String[] args){
        Operacion op = new Operacion();
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
    }

}

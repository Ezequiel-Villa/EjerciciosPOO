package prueba;

// Archivo en paquete2: ClaseOtroPaquete.java
import practica_06.ClasePrincipal;

public class ClaseOtroPaquete extends ClasePrincipal {
    public void probarVisibilidad() {
        ClasePrincipal principal = new ClasePrincipal();
        
        // Acceso a atributos y métodos de ClasePrincipal
        System.out.println(principal.atributoPublico); // Accesible
        // System.out.println(principal.atributoProtegido); // Error: No accesible desde otra clase (pero accesible al heredar)
        // System.out.println(principal.atributoPorDefecto); // Error: No accesible fuera del paquete
        // System.out.println(principal.atributoPrivado); // Error: No accesible

        // Métodos accesibles solo a través de herencia en subclases
        this.metodoProtegido(); // Accesible al heredar
        // principal.metodoProtegido(); // Error si no se accede como subclase
        principal.metodoPublico(); // Accesible
    }
}

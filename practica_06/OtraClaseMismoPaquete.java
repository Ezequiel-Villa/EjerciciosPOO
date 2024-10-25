package practica_06;

// Archivo en paquete1: OtraClaseMismoPaquete.java

public class OtraClaseMismoPaquete {
    public void probarVisibilidad() {
        ClasePrincipal principal = new ClasePrincipal();
        
        // Acceso a atributos y métodos de ClasePrincipal
        System.out.println(principal.atributoPublico); // Accesible
        System.out.println(principal.atributoProtegido); // Accesible
        System.out.println(principal.atributoPorDefecto); // Accesible
        // System.out.println(principal.atributoPrivado); // Error: No accesible

        principal.metodoPublico(); // Accesible
        principal.metodoProtegido(); // Accesible
        principal.metodoPorDefecto(); // Accesible
        // principal.metodoPrivado(); // Error: No accesible
    }
}

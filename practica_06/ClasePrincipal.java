package practica_06;

// Archivo en paquete1: ClasePrincipal.java

public class ClasePrincipal {
    public String atributoPublico = "Atributo público";
    private String atributoPrivado = "Atributo privado";
    protected String atributoProtegido = "Atributo protegido";
    String atributoPorDefecto = "Atributo por defecto"; // Sin modificador: default

    public void metodoPublico() {
        System.out.println("Método público");
    }

    private void metodoPrivado() {
        System.out.println("Método privado");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }

    void metodoPorDefecto() {
        System.out.println("Método por defecto");
    }
}

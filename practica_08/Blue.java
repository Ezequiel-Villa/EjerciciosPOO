
// Subclase Blue
class Blue extends Bird {
    public Blue() {
        super("Blue", 100, 20, "Pajaro Azul", "Velocidad");
    }

    public void dividir() {  
        // Lógica para dividirse en tres pájaros  
        System.out.println(getNombre() + " se divide en tres y ataca en grupo!");  
        // Implementar código que simule el daño de los tres pájaros.
        
    }  
}




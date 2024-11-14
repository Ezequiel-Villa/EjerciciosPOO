
// Clase base Bird
public class Bird {
    private String nombre;
    private int salud;
    private int fuerza;
    private String tipoAve;
    private String habilidadEspecial;

    public Bird(String nombre, int salud, int fuerza, String tipoAve, String habilidadEspecial) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
        this.tipoAve = tipoAve;
        this.habilidadEspecial = habilidadEspecial;
    }

    // Método para atacar a un enemigo  
    public void atacar(Bird enemigo) {  
        // Implementar la lógica de ataque aquí  
        enemigo.recibirDanio(this.fuerza);  
    }  
    
    // Método para usar la habilidad especial  
    public void usarHabilidadEspecial() {  
        // Implementar la lógica para usar la habilidad especial aquí  
        System.out.println(nombre + " usa su habilidad especial: " + habilidadEspecial);  
    }  

    // Método para recibir daño  
    public void recibirDanio(double cantidad) {  
        this.salud -= cantidad;  
        if (this.salud < 0) {  
            this.salud = 0;  
        } 
        System.out.println(nombre + " ha recibido " + cantidad + " de daño.");
    }  

    // Método para curar al personaje  
    public void curar(int cantidad) {  
        this.salud += cantidad; 
        System.out.println("Curando..."); 
    }  

    // Método para gritar o emitir un sonido  
    public void gritar() {  
        // Implementar sonido o frase del personaje   
        System.out.println(nombre + " groww!");  
    }  
    
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getTipoAve() {
        return tipoAve;
    }

    public void setTipoAve(String tipoAve) {
        this.tipoAve = tipoAve;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    
}



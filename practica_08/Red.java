
// Subclase Red
public class Red extends Bird {
    public Red() {
        super("Red", 100, 20, "Pajaro Rojo", "Ataque de carga");
    }


    public void cargar() {  
        // Lógica de ataque de carga  
        System.out.println(getNombre() + " se lanza hacia adelante con carga de ataque!");  
        // Implementar código para el impacto y daño.
        // Por ejemplo, el daño es proporcional al fuerza del pajaro rojo.
        double daño = getFuerza() * 0.5;
        recibirDanio(daño);

    }  
}



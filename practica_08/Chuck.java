
// Subclase Chuck
class Chuk extends Bird {
    public Chuk() {
        super("Chuck", 100, 20, "Ave", "Lanza rápidamente");
    }


    public void acelerar() {  
        // Lógica de aceleración  
        System.out.println(getNombre() + " acelera rápidamente!");  
        // Implementar código para el impacto con daño aumentado por la velocidad.
        // Por ejemplo, el daño se calcula como la fuerza multiplicada por la velocidad.
        double velocidad = 10;
        double daño = getFuerza() * velocidad;
        recibirDanio(daño);
    } 
}




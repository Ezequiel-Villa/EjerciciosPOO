package practica_07;

class Cuenta { // clase con los atributos y metodos para las operaciones a realizar 
    private String nombreTitular;
    private String tipoCuenta;
    private double saldo;
    private String numeroCuenta;
    private String clabeInterbancaria;
    private String pin;

    public Cuenta(String nombreTitular, String tipoCuenta, double saldo, String numeroCuenta, String clabeInterbancaria, String pin) {
        this.nombreTitular = nombreTitular;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.clabeInterbancaria = clabeInterbancaria;
        this.pin = pin;
    }

    //getters and setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public boolean verificarPin(String pinIngresado) {
        return this.pin.equals(pinIngresado);
    }

    public double consultarSaldo() {
        return saldo;
    }

    //metodos para depositar y retirar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado con éxito. Saldo actual: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado con éxito. Saldo actual: " + saldo);
        } else {
            System.out.println("Monto de retiro inválido o fondos insuficientes.");
        }
    }
}




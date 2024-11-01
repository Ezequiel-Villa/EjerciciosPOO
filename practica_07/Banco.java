package practica_07;

import java.util.ArrayList;

public class Banco {  //En esta clase se registran nuevas cuentas 
    private ArrayList<Cuenta> cuentas;

    public Banco() {  //constructor de cuentas
        cuentas = new ArrayList<>();
    }

    //registro de cuentas
    public void registrarCuenta(String nombreTitular, String tipoCuenta, double saldoInicial, String numeroCuenta, String clabeInterbancaria, String pin) {
        if (pin.length() == 4 && pin.matches("\\d+")) {
            Cuenta nuevaCuenta = new Cuenta(nombreTitular, tipoCuenta, saldoInicial,numeroCuenta,clabeInterbancaria, pin);
            cuentas.add(nuevaCuenta);
            System.out.println("Cuenta creada exitosamente");
        } else {
            System.out.println("El PIN debe ser de 4 dígitos numéricos");
        }
    }

    public Cuenta accederCuenta(String numeroCuenta, String pin) { //metodo para buscar y acceder a una cuenta
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta) && cuenta.verificarPin(pin)) {
                return cuenta;
            }
        }
        System.out.println("Número de cuenta o PIN incorrecto");
        return null;
    }
}


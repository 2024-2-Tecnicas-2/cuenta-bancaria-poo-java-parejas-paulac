package com.mycompany.cuenta.bancaria.poo;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private double tipoInteres=1.5;
    
     public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

   public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para ingresar una cantidad
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Has ingresado: " + cantidad + ". Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a ingresar debe ser mayor que cero.");
        }
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentab;

public class CuentaAhorro {
    private long numCuenta;
    private String ciCliente;
    private double saldo;
    private double interes;

    public CuentaAhorro() {
    }

    public CuentaAhorro(long numCuenta, String ciCliente, double saldo, double interes) {
        this.numCuenta = numCuenta;
        this.ciCliente = ciCliente;
        this.saldo = saldo;
        this.interes = interes;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCiCliente() {
        return ciCliente;
    }

    public void setCiCliente(String ciCliente) {
        this.ciCliente = ciCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
        
    }

    public void acreditar(double monto) {
        saldo += monto;
        System.out.println("Se acreditó " + monto + " en la cuenta de ahorro.");
    }

    public boolean debitar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Se retiro " + monto + " de tu cuenta de ahorros.");
            return true;
        }
        return false;
    }

    public void imprimir() {
        System.out.println("Número de cuenta: " + numCuenta);
        System.out.println("CI del cliente: " + ciCliente);
        System.out.println("Saldo actual: " + saldo);
        System.out.println("Interés: " + interes);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentab;

/**
 *
 * @author New Pc
 */
public class banco {
    private String nombreBanco;
    private String ciudad;
    private CuentaAhorro cuentaAhorro;
    private int cantidadCuentas;

    public banco() {
        this.nombreBanco = "";
        this.ciudad = "";
        this.cuentaAhorro = new CuentaAhorro();
        this.cantidadCuentas = 0;
    }

    public banco(String nombreBanco, String ciudad, int cantidadCuentas) {
        this.nombreBanco = nombreBanco;
        this.ciudad = ciudad;
        this.cuentaAhorro = new CuentaAhorro(123456789, "Jose elmo dongo", 1000, 0.05);
        this.cantidadCuentas = cantidadCuentas;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCantidadCuentas() {
        return cantidadCuentas;
    }

    public void setCantidadCuentas(int cantidadCuentas) {
        this.cantidadCuentas = cantidadCuentas;
    }

    public void acreditarCuentaAhorro(double monto) {
        cuentaAhorro.acreditar(monto);
    }

    public boolean debitarCuentaAhorro(double monto) {
        return cuentaAhorro.debitar(monto);
    }

    public void datosCuentaAhorro() {
        cuentaAhorro.imprimir();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

import cuentab.banco;

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        banco objBanco = new banco("Banco De Pichincha", "Guayaquil", 1);

        do {
            mostrarMenu();
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = input.nextDouble();
                    objBanco.acreditarCuentaAhorro(montoDeposito);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = input.nextDouble();
                    boolean exitoRetiro = objBanco.debitarCuentaAhorro(montoRetiro);
                    if (!exitoRetiro) {
                        System.out.println("No se pudo realizar el retiro, saldo insuficiente");
                    }
                    break;
                case 3:
                    objBanco.datosCuentaAhorro();
                    break;
                case 4:
                    System.out.println("Adiós!");
                    break;
            }
        } while (opcion != 4);
        input.close();
    }

    public static void mostrarMenu() {
        System.out.println("Menú de opciones :v");
        System.out.println("1. Acreditar dinero a la cuenta bancaria conocido el monto a depositar.");
        System.out.println("2. Debitar dinero de la cuenta bancaria conocido el monto a sacar.");
        System.out.println("3. Mostrar los datos de la cuenta bancaria.");
        System.out.println("4. Salir.");
        System.out.print("Seleccione una opción: ");
    }

}

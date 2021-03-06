/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.time.LocalDate;

/**
 *
 * @author Rosa
 * @version 1.0
 */
public class tarjeta {

    int cuenta;
    private double limiteCajero;
    private double limiteInternet;

    /**
     *
     * @param cuenta
     * @param limiteCajero
     * @param limiteInternet
     */
    public tarjeta(int cuenta, double limiteCajero, double limiteInternet) {
        this.cuenta = cuenta;
        this.limiteCajero = limiteCajero;
        this.limiteInternet = limiteInternet;
    }

    /**
     *
     * @param dinero
     * @param cuenta
     * @return boolean true si el dinero es menor que el saldo y menor que el limite
     */
    public boolean retirarDinero(double dinero, Cuenta cuenta) {
        if (cuenta.getSaldo() >= dinero && dinero <= limiteCajero) {
            cuenta.setSaldo(cuenta.getSaldo() - dinero);
            System.out.println("Se ha realizado con éxito");
            return true;
        } else {
            System.out.println("El dinero es superior al límite o al que hay en la cuenta");
            return false;
        }
    }

    /**
     *
     * @param dinero
     * @param cuenta
     * @return booleantrue si el dinero es menor que el saldo y menor que el limite
     */
    public boolean pagoInternet(double dinero, Cuenta cuenta) {
        if (cuenta.getSaldo() >= dinero && dinero <= limiteInternet) {
            cuenta.setSaldo(cuenta.getSaldo() - dinero);
            System.out.println("Se ha realizado con éxito");
            return true;
        } else {
            System.out.println("El dinero es superior al límite o al que hay en la cuenta");
            return false;
        }
    }

    @Override
    public String toString() {
        return "tarjeta con limite de cajero: " + limiteCajero + ",y su limite de Internet: " + limiteInternet ;
    }

}

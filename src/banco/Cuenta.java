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
public class Cuenta {
    String nifCliente;
    int cuenta;
    double saldo;
    double limite;
    LocalDate fechaApertura;

    /**
     *
     * @param nifCliente
     * @param cuenta
     * @param saldo
     * @param limite
     * @param fechaApertura
     */
    public Cuenta(String nifCliente, int cuenta, double saldo, double limite, LocalDate fechaApertura) {
        this.nifCliente = nifCliente;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.limite = limite;
        this.fechaApertura = fechaApertura;
    }

    /**
     *
     * @return nif
     */
    public String getNifCliente() {
        return nifCliente;
    }

    /**
     *
     * @param nifCliente
     */
    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    /**
     *
     * @return cuenta
     */
    public int getCuenta() {
        return cuenta;
    }

    /**
     *
     * @param cuenta
     */
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     *
     * @param limite
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    /**
     *
     * @return fecha
     */
    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    /**
     *
     * @param fechaApertura
     */
    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    @Override
    public String toString() {
        return "La cuenta de DNI " + nifCliente + ", con número de cuenta " + cuenta + ",un saldo de " + saldo + ",y un limite de " + limite + ", se arbio en " + fechaApertura + '}';
    }
    
    
}

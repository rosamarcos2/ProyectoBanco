/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    String nifCliente;
    int cuenta;
    double saldo;
    double limite;
    LocalDate fechaApertura;

    public Cuenta(String nifCliente, int cuenta, double saldo, double limite, LocalDate fechaApertura) {
        this.nifCliente = nifCliente;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.limite = limite;
        this.fechaApertura = fechaApertura;
    }

    public String getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    
    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nifCliente=" + nifCliente + ", cuenta=" + cuenta + ", saldo=" + saldo + ", limite=" + limite + ", fechaApertura=" + fechaApertura + '}';
    }
    
    
}

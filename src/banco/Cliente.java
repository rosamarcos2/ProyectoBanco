/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Rosa
 * @version 1.0
 */
public class Cliente {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String nif;
    private int telefono;
    private int edad;
    int cuenta;

      //@param Constructor 
    /**
     *
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param nif
     * @param telefono
     * @param edad
     * @param cuenta
     */
    public Cliente(String nombre, String apellidos, String direccion, String nif, int telefono, int edad, int cuenta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nif = nif;
        this.telefono = telefono;
        this.edad = edad;
        this.cuenta = cuenta;
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
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return nif
     */
    public String getNif() {
        return nif;
    }

    /**
     *
     * @param nif
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     *
     * @return telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @param dinero
     * @param nuevo
     * @return boolean true 
     */
    public boolean ingresar(double dinero, Cuenta nuevo) {
        nuevo.setSaldo(nuevo.getSaldo() + dinero);
        return true;
    }

    /**
     *
     * @param dinero
     * @param nuevo
     * @return boolean true si el dinero es menor que el saldo
     */
    public boolean retirar(double dinero, Cuenta nuevo) {
        if (nuevo.saldo >= dinero && nuevo.limite>=dinero) {
            nuevo.saldo = nuevo.saldo - dinero;
            nuevo.setSaldo(nuevo.getSaldo() - dinero);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", nif=" + nif + ", telefono=" + telefono + ", edad=" + edad + ", cuenta=" + cuenta + '}';
    }

}

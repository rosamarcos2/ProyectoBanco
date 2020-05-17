/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String nif;
    private int telefono;
    private int edad;
    int cuenta;

    public Cliente(String nombre, String apellidos, String direccion, String nif, int telefono, int edad, int cuenta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nif = nif;
        this.telefono = telefono;
        this.edad = edad;
        this.cuenta = cuenta;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    public boolean ingresar(double dinero, Cuenta nuevo){
        nuevo.setSaldo(nuevo.getSaldo()+dinero);
        return true;
    }
    public boolean retirar(double dinero, Cuenta nuevo){
        if( nuevo.saldo>=dinero){
        nuevo.saldo=nuevo.saldo-dinero;
        nuevo.setSaldo(nuevo.getSaldo()-dinero);
        return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", nif=" + nif + ", telefono=" + telefono + ", edad=" + edad + ", cuenta=" + cuenta + '}';
    }
    
}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rosa
 * @version 1.0
 */
public class Gestor {

    Scanner sc = new Scanner(System.in);
    String nombre;
    String clave;

    /**
     *
     * @param nombre
     * @param clave
     */
    public Gestor(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
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
     * @return clave
     */
    public String getClave() {
        return clave;
    }

    /**
     *
     * @param clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     *
     * @return nuevo Cliente
     */
    public Cliente crearCliente() {
        Random rn = new Random();
        System.out.println("Usted va a crear una nueva cuenta");
        System.out.println("Introduce el nombre: ");
        String nombre = sc.next();
        System.out.println("Introduce apellidos");
        String apellidos = sc.next();
        System.out.println("Introduce su domicilio: ");
        String domicilio = sc.next();
        System.out.println("Introduce su dni: ");
        String dni = sc.next();
        System.out.println("Introduce su edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce su telefono:");
        int telefono = sc.nextInt();
        int cuenta = (int) Math.floor(Math.random() * 5000 + 1);
        ArrayList<Cliente> clientes = new ArrayList();
        clientes.add(new Cliente(nombre, apellidos, domicilio, dni, telefono, edad, cuenta));
        return clientes.get(0);
    }

    /**
     *
     * @param cliente
     * @return Nueva cuenta
     */
    public Cuenta crearCuenta(Cliente cliente) {

        System.out.println("Introduce su dni: ");
        String dni = sc.next();
        System.out.println("Introduce la cantidad a ingresar: ");
        double cantidad = sc.nextDouble();
        System.out.println("Introduce el limite que desea poner: ");
        double limite = sc.nextDouble();
        int cuenta = (int) Math.floor(Math.random() * 5000 + 1);
        ArrayList<Cuenta> cuen = new ArrayList();
        cuen.add(new Cuenta(dni, cliente.getCuenta(), cantidad, limite, LocalDate.now()));
        return cuen.get(0);
    }

    /**
     *
     * @param cliente
     * @return nueva tarjeta
     */
    public tarjeta crearTarjeta(Cliente cliente) {
        System.out.println("Usted va a crear una nueva tarjeta");
        System.out.println("Introduce el limite de pago normal con tarjeta: ");
        double pago = sc.nextDouble();
        System.out.println("Introduce el limite de pago por internet");
        double in = sc.nextDouble();
        ArrayList<tarjeta> tar = new ArrayList();
        tar.add(new tarjeta(cliente.getCuenta(), pago, in));
        return tar.get(0);
    }

    /**
     *
     * @param opc
     * @return nuevo String
     */
    public boolean modificar(int opc, Cliente cliente) {
        String nom=" ";
        int n;
        double no;
        switch (opc) {
            
            case 1:
                System.out.println("Introduce nuevo nombre: ");
                nom = sc.next();
                cliente.setNombre(nom);
                break;
            case 2:
                System.out.println("Introduce nuevos apellidos: ");
                nom = sc.next();
                cliente.setApellidos(nom);
                break;
            case 3:
                System.out.println("Introduce nueva dirección: ");
                nom = sc.next();
                cliente.setDireccion(nom);
                break;
            case 4:
                System.out.println("Introduce nuevo DNI: ");
                nom = sc.next();
                cliente.setNif(nom);
                break;
            case 5:
                System.out.println("Introduce el nuevo telefono: ");
                n = sc.nextInt();
                cliente.setTelefono(n);
                break;
            case 6:
                System.out.println("Introduce nueva edad: ");
                n = sc.nextInt();
                cliente.setEdad(n);
                break;
        }
        return true;
    }


}

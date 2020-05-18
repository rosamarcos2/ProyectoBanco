/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import banco.Cliente;
import banco.Cuenta;
import banco.Gestor;
import banco.tarjeta;
import java.time.LocalDate;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Rosa
 * @version 1.0
 */

public class BancoTest {

   @Test
    public void Cuenta(){
    Cuenta c= new Cuenta("45345658L",5789,1000,100,LocalDate.of(2019, 5, 13));
    
    assertTrue("45345658L".equals(c.getNifCliente()));
    assertTrue(5789==c.getCuenta());
    assertTrue(1000==c.getSaldo());
    c.setLimite(50);
    assertTrue(50==c.getLimite());
    c.setNifCliente("1234");
    assertTrue(c.getCuenta()==5789);
    assertNotNull(c.toString());
    c.setCuenta(1234);
    c.setSaldo(5000);
    c.setFechaApertura(LocalDate.of(2019, 5, 14));
    
}
    @Test
    public void Cliente(){
        Cliente cl=new Cliente("Rosa","Marcos", "Gran Via","45345658L",658753458,19,5789);
        Cuenta c= new Cuenta("45345658L",5789,1000,100,LocalDate.of(2019, 5, 13));
        assertTrue(cl.ingresar(100, c)==true);
        assertTrue(cl.retirar(100, c)==true);
        assertTrue(cl.retirar(8000, c)==false);
        assertTrue(cl.getCuenta()==5789);
        cl.setCuenta(1234);
        assertTrue(cl.getNombre().equals("Rosa"));
        cl.setNombre("Rosita");
        cl.setApellidos("Marcos Carvajal");
        assertTrue(cl.getApellidos().equals("Marcos Carvajal"));
        cl.setDireccion("Gran Via 1");
        assertTrue(cl.getDireccion().equals("Gran Via 1"));
        assertTrue(cl.getNif().equals("45345658L"));
        cl.setNif("12345L");
        assertTrue(cl.getTelefono()==658753458);
        cl.setEdad(20);
        assertTrue(cl.getEdad()==20);
        cl.setTelefono(689578547);
        assertNotNull(cl.toString());
    }
    @Test
    public void tarjeta(){
        tarjeta t= new tarjeta(5789,500,50);
        Cuenta c= new Cuenta("45345658L",5789,1000,100,LocalDate.of(2019, 5, 13));
        assertTrue(t.pagoInternet(7000, c)==false);
        assertTrue(t.pagoInternet(50, c)==true);
        assertTrue(t.retirarDinero(100, c)==true);
        assertTrue(t.retirarDinero(8000, c)==false);
        assertNotNull(t.toString());
    }
   @Test
    public void Gestor(){
        Scanner sc= new Scanner(System.in);
        Gestor g= new Gestor("Rosa","clave");
        Cliente cl=new Cliente("Rosa","Marcos", "Gran Via","45345658L",658753458,19,5789);
        Cuenta c= new Cuenta("45345658L",5789,1000,100,LocalDate.of(2019, 5, 13));
        g.setNombre("Roberto");
        g.setClave("clavee");
        assertTrue(g.getNombre().equals("Roberto"));
        assertTrue(g.getClave().equals("clavee"));
    }
}

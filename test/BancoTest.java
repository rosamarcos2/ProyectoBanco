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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */

public class BancoTest {
    
   @Test
    public void Cuenta(){
    Cuenta c= new Cuenta("45345658L",5789,1000,100,LocalDate.of(2019, 5, 13));
    
    assertTrue("45345658L".equals(c.getNifCliente()));
    c.setNifCliente("1234");
    assertTrue(c.getCuenta()==5789);

}
    public void Cliente(){
        Cliente cl=new Cliente("Rosa","Marcos", "Gran Via","45345658L",658753458,19,5789);
        Cuenta c= new Cuenta("45345658L",5789,1000,100,LocalDate.of(2019, 5, 13));
        assertTrue(cl.ingresar(100, c)==true);
        assertTrue(cl.retirar(100, c)==true);
        assertTrue(cl.retirar(8000, c)==false);
    }
    public void tarjeta(){
        tarjeta t= new tarjeta(5789,500,50);
        Cuenta c= new Cuenta("45345658L",5789,1000,100,LocalDate.of(2019, 5, 13));
        assertTrue(t.pagoInternet(100, c)==true);
        assertTrue(t.pagoInternet(7000, c)==false);
        assertTrue(t.retirarDinero(100, c)==true);
        assertTrue(t.retirarDinero(800, c)==false);
    }
    public void Gestor(){
        Gestor g= new Gestor("Rosa","clave");
        Cliente cl=new Cliente("Rosa","Marcos", "Gran Via","45345658L",658753458,19,5789);
        Cuenta c= new Cuenta("45345658L",5789,1000,100,LocalDate.of(2019, 5, 13));
        assertNotNull(g.crearCliente());
        assertNotNull(g.crearCuenta(cl));
        assertNotNull(g.crearTarjeta(cl));
        assertNotNull(g.modificarS(3));
        assertTrue("Rosa".equals(g.modificarS(1)));
        assertTrue(g.modificarT(5)==20);
        assertTrue(g.modificarD(8)==20.00);
    }
}

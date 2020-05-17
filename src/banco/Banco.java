/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Banco {
static Scanner sc= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Gestor> gestores= new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();
        ArrayList<Cuenta> cuentas=new ArrayList();
        ArrayList<tarjeta> tar= new ArrayList();
        clientes.add(new Cliente("Rosa","Marcos", "Gran Via","45345658L",658753458,19,5789));
        cuentas.add(new Cuenta("45345658L",5789,1000,100,LocalDate.of(2019, 5, 13)));
        cuentas.add(new Cuenta("45345658L",5790,4000,100,LocalDate.of(2018, 3, 13)));
        tar.add(new tarjeta(5789,200,100));
        
        gestores.add(new Gestor("Raul","clave"));
         int opc;
        do{
            opc=mostrarMenu();
            switch(opc){
                case 1:
                     int u;
                    do{
                    u=menuUsu();
                    switch(u){
                        case 1:
                            System.out.println("Introduce su nombre de usuario: ");
                            String nombre=sc.next();
                            System.out.println("Introduce su dni: ");
                            String dni= sc.next();
                            System.out.println("Introduce su número de cuenta: ");
                            int cuenta=sc.nextInt();
                            for (int i = 0; i < clientes.size(); i++) {
                                if(clientes.get(i).getNombre().equals(nombre) && clientes.get(i).getNif().equals(dni) && clientes.get(i).getCuenta()==cuenta){
                                    for (int j = 0; j < cuentas.size(); j++) {
                                        if (cuentas.get(j).getCuenta()==clientes.get(i).getCuenta()) {
                                            System.out.println("Introduce la cantidad de dinero que desea ingresar: ");
                                            double dinero= sc.nextDouble();
                                            if(clientes.get(i).ingresar(dinero,cuentas.get(j))){
                                                System.out.println("El dinero se ha ingresado con exito");
                                            }else{
                                                System.out.println("No se ha podido ingresar");
                                            } 
                                        }
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Introduce su nombre de usuario: ");
                            nombre=sc.next();
                            System.out.println("Introduce su dni: ");
                            dni= sc.next();
                            System.out.println("Introduce su número de cuenta: ");
                            cuenta=sc.nextInt();
                            for (int i = 0; i < clientes.size(); i++) {
                                if(clientes.get(i).getNombre().equals(nombre) && clientes.get(i).getNif().equals(dni) && clientes.get(i).getCuenta()==cuenta){
                                    for (int j = 0; j < cuentas.size(); j++) {
                                        if (cuentas.get(j).getCuenta()==clientes.get(i).getCuenta()) {
                                            System.out.println("Introduce la cantidad de dinero que desea ingresar: ");
                                            double dinero= sc.nextDouble();
                                            if(clientes.get(i).retirar(dinero,cuentas.get(j))){
                                                System.out.println("El dinero se ha retirado con exito");
                                            }else{
                                                System.out.println("No se ha podido retirar");
                                            } 
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Introduce su nombre de usuario: ");
                            nombre=sc.next();
                            System.out.println("Introduce su dni: ");
                            dni= sc.next();
                            System.out.println("Introduce su número de cuenta: ");
                            cuenta=sc.nextInt();
                            System.out.println("1. Pago internet");
                            System.out.println("2. Pago efectivo");
                            System.out.println("Introduce la opción: ");
                            int n=sc.nextInt();
                            if(n==1){
                            for (int i = 0; i < clientes.size(); i++) {
                                if(clientes.get(i).getNombre().equals(nombre) && clientes.get(i).getNif().equals(dni) && clientes.get(i).getCuenta()==cuenta){
                                     for (int j = 0; j < cuentas.size(); j++) {
                                        if (cuentas.get(j).getCuenta()==clientes.get(i).getCuenta()) {
                                            System.out.println("Introduce la cantidad del pago: ");
                                            double cant=sc.nextDouble();
                                            tar.get(i).pagoInternet(cant,cuentas.get(j));
                                        }
                                     }
                                    
                                }
                            }
                            }else if(n==2){
                               for (int i = 0; i < clientes.size(); i++) {
                                if(clientes.get(i).getNombre().equals(nombre) && clientes.get(i).getNif().equals(dni) && clientes.get(i).getCuenta()==cuenta){
                                     for (int j = 0; j < cuentas.size(); j++) {
                                        if (cuentas.get(j).getCuenta()==clientes.get(i).getCuenta()) {
                                            System.out.println("Introduce la cantidad del pago: ");
                                            double cant=sc.nextDouble();
                                        tar.get(i).retirarDinero(cant,cuentas.get(j));
                                        }
                                     }
                                }
                            } 
                            }
                            break;
                        case 4:
                            System.out.println("Introduce su nombre de usuario: ");
                            nombre=sc.next();
                            System.out.println("Introduce su dni: ");
                            dni= sc.next();
                            for (int i = 0; i < clientes.size(); i++) {
                                if(clientes.get(i).getNombre().equals(nombre) && clientes.get(i).getNif().equals(dni) ){
                                     for (int j = 0; j < cuentas.size(); j++) {
                                        if (cuentas.get(j).getNifCliente()==clientes.get(i).getNif()) {
                                            System.out.println(clientes.get(i).toString());
                                            System.out.println(cuentas.get(j).toString());
                                        }
                                     }
                                    
                                }
                            }
                            break;
                        case 5:
                            System.out.println("Hasta la proxima.");
                            break;
                        default:
                            System.out.println("No ha elegido un número correcto");
                             break;   
                        }
                    }while(u!=5);
                    break;
                case 2:
                    int g;
                    do{
                    g=menuGes();
                    switch(g){
                        case 1:
                            System.out.println("Introduce el nombre de usuario: ");
                            String usuario=sc.next();
                            System.out.println("Introduce la clave: ");
                            String clave=sc.next();
                            for (int i = 0; i < gestores.size(); i++) {
                                if(gestores.get(i).getNombre().equals(usuario) && gestores.get(i).getClave().equals(clave)){
                                    System.out.println("Nuevo cliente: ");
                                    clientes.add(gestores.get(i).crearCliente());
                                    int c= clientes.size();
                                    System.out.println("Nueva cuenta: ");
                                    cuentas.add(gestores.get(i).crearCuenta(clientes.get(c-1)));
                                   
                                    System.out.println("El cliente quiere tarjeta? [(SI)1,(NO)2]");
                                    int s= sc.nextInt();
                                    if(s==1){
                                        tar.add(gestores.get(i).crearTarjeta(clientes.get(i)));
                                    }else{
                                        System.out.println("Operación realizada");
                                    }
                                }
                            }
                            mostrar(clientes,cuentas);
                            
                            break;
                        case 2:
                            System.out.println("Introduce el nombre de usuario: ");
                            usuario=sc.next();
                            System.out.println("Introduce la clave: ");
                            clave=sc.next();
                            
                             for (int i = 0; i < gestores.size(); i++) {
                                if(gestores.get(i).getNombre().equals(usuario) && gestores.get(i).getClave().equals(clave)){
                                    System.out.println("Introduce el dni del cliente");
                                    String dni=sc.next();
                                    for (int j = 0; j < clientes.size(); j++) {
                                        if (clientes.get(j).getNif().equals(dni)) {
                                        cuentas.add(gestores.get(i).crearCuenta(clientes.get(i)));
                                    }
                                    }
                                    
                                }
                                }
                            break;
                        case 3:
                            
                            System.out.println("Introduce el nombre de usuario: ");
                            usuario=sc.next();
                            System.out.println("Introduce la clave: ");
                            clave=sc.next();
                            System.out.println("A continuación se van a mostrar las cuentas y los clientes");
                            System.out.println("Pulsa 'C' para continuar");
                            String c=sc.next();
                            mostrar(clientes,cuentas);
                            System.out.println("Pulsa 'C' para continuar");
                            c=sc.next();
                            int op=submenu();
                            for (int i = 0; i < gestores.size(); i++) {
                                if(gestores.get(i).getNombre().equals(usuario) && gestores.get(i).getClave().equals(clave)){
                                    switch(op){
                                        case 1:
                                            
                                            System.out.println("Introduce el nombre del cliente que desea cambiar: ");
                                            String nombre= sc.next();
                                            System.out.println("Introduce el dni del cliente que desea cambiar: ");
                                            String dni= sc.next();
                                            for (int j = 0; j < clientes.size(); j++) {
                                                if(clientes.get(j).getNombre().equals(nombre) && clientes.get(j).getNif().equals(dni)){
                                                    clientes.get(j).setNombre(gestores.get(i).modificarS(op));
                                                }
                                            }
                                            break;
                                        case 2:
                                            
                                            System.out.println("Introduce los apellidos del cliente que desea cambiar: ");
                                            String apellidos= sc.next();
                                            System.out.println("Introduce el dni del cliente que desea cambiar: ");
                                            dni= sc.next();
                                            for (int j = 0; j < clientes.size(); j++) {
                                                if(clientes.get(j).getApellidos().equals(apellidos)  && clientes.get(j).getNif().equals(dni)){
                                                    clientes.get(j).setApellidos(gestores.get(i).modificarS(op));
                                                }
                                            }
                                            break;
                                        case 3:
                                           
                                            System.out.println("Introduce la dirección del cliente que desea cambiar: ");
                                            String direccion= sc.next();
                                            System.out.println("Introduce el dni del cliente que desea cambiar: ");
                                            dni= sc.next();
                                            for (int j = 0; j < clientes.size(); j++) {
                                                if(clientes.get(j).getDireccion().equals(direccion) && clientes.get(j).getNif().equals(dni)){
                                                    clientes.get(j).setDireccion(gestores.get(i).modificarS(op));
                                                }
                                            }
                                            break;
                                        case 4:
                                            
                                            System.out.println("Introduce el dni del cliente que desea cambiar: ");
                                            dni= sc.next();
                                            for (int j = 0; j < clientes.size(); j++) {
                                                if(clientes.get(j).getNif().equals(dni)){                                                    
                                                            clientes.get(j).setNif(gestores.get(i).modificarS(op));
                                                        }
                                                    }
                                            for (int k = 0; k < cuentas.size(); k++) {
                                                        if(cuentas.get(k).getNifCliente().equals(dni)){
                                                    cuentas.get(k).setNifCliente(gestores.get(i).modificarS(op));
                                                }
                                            }
                                            break;
                                        case 5:
                                            
                                            System.out.println("Introduce el telefono del cliente que desea cambiar: ");
                                            int telefono= sc.nextInt();
                                            System.out.println("Introduce el dni del cliente que desea cambiar: ");
                                            dni= sc.next();
                                            for (int j = 0; j < clientes.size(); j++) {
                                                if(clientes.get(j).getTelefono()==telefono && clientes.get(j).getNif().equals(dni)){
                                                    clientes.get(j).setTelefono(gestores.get(i).modificarT(op));
                                                }
                                            }
                                            break;
                                        case 6:
                                          
                                            System.out.println("Introduce la edad del cliente que desea cambiar: ");
                                            int edad= sc.nextInt();
                                            System.out.println("Introduce el dni del cliente que desea cambiar: ");
                                            dni= sc.next();
                                            for (int j = 0; j < clientes.size(); j++) {
                                                if(clientes.get(j).getEdad()==edad  && clientes.get(j).getNif().equals(dni)){
                                                    clientes.get(j).setEdad(gestores.get(i).modificarT(op));
                                                }
                                            }
                                            break;
                                         case 7:
                                            
                                            System.out.println("Introduce el saldo del cliente que desea cambiar: ");
                                            double saldo= sc.nextDouble();
                                            System.out.println("Introduce el dni del cliente que desea cambiar: ");
                                            dni= sc.next();
                                            for (int j = 0; j < cuentas.size(); j++) {
                                                if(cuentas.get(j).getSaldo()==saldo && cuentas.get(j).getNifCliente().equals(dni)){
                                                    cuentas.get(j).setSaldo(gestores.get(i).modificarT(op));
                                                }
                                            }
                                            break;
                                        case 8:
                                            System.out.println("Introduce el limite del cliente que desea cambiar: ");
                                            int limite= sc.nextInt();
                                            System.out.println("Introduce el dni del cliente que desea cambiar: ");
                                            dni= sc.next();
                                            for (int j = 0; j < cuentas.size(); j++) {
                                                if(cuentas.get(j).getLimite()==limite && cuentas.get(j).getNifCliente().equals(dni)){
                                                    cuentas.get(j).setLimite(gestores.get(i).modificarT(op));
                                                }
                                            }
                                            break;
                                            
                                    }
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Hasta la proxima");
                            break;
                        default:
                            System.out.println("Opción incorrecta");
                        break;
                    }
                    }while(g!=4);
                    break;
                case 3: 
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            
            }
        }while(opc!=3);
        
        
        
        
    }
     public static int mostrarMenu(){
        System.out.println("BANCO CAÑAV");
        System.out.println("1. Usuario");
        System.out.println("2. Gestor");
        System.out.println("3. Salir");
        System.out.println("Introduce una opción");
        int o=sc.nextInt();
        return o;
    }
    public static int menuUsu(){
        System.out.println("Menu Usuario");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Pagar con tarjeta");
        System.out.println("4. Ver información");
        System.out.println("5. Salir");
        System.out.println("Introduce una opción: ");
        int o=sc.nextInt();
        return o;
    }
    public static int menuGes(){
        System.out.println("Menu Gestores");
        System.out.println("1. Crear nuevo cliente y cuenta");
        System.out.println("2. Crear cuenta");
        System.out.println("3. Modificar cuenta");
        System.out.println("4. Salir");
        System.out.println("Introduce una opción: ");
        int o=sc.nextInt();
        return o;
    }
   public static int submenu(){
       System.out.println("Que desea modificar? ");
        System.out.println("1. Nombre");
        System.out.println("2. Apellidos");
        System.out.println("3. Dirección");
        System.out.println("4. Dni");
        System.out.println("5. Telefono");
        System.out.println("6. Edad");
        System.out.println("7. Cantidad");
        System.out.println("8. Limite");
        System.out.println("Introduce una opción: ");
        int opc= sc.nextInt();
        return opc;
   }
   public static void mostrar(ArrayList clientes,ArrayList cuentas){
       System.out.println("CLIENTES: ");
       for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
       System.out.println("CUENTAS: ");
       for (int i = 0; i < cuentas.size(); i++) {
            System.out.println(cuentas.get(i).toString());
       }
   }
}

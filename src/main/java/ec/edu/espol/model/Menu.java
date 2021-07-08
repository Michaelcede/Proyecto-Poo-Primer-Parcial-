/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;
import java.util.Scanner;
/**
 *
 * @author jimmy
 */
public class Menu {
    
    public static int menuPrincipal() {

        int selection;
        Scanner input = new Scanner(System.in);


        System.out.println("1 - Vendedorr");
        System.out.println("2 - Comprador");
        System.out.println("3 - Salir");

        selection = input.nextInt();
        input.close();
        return selection;    
    }
    
    public static int menuVendedor() {

        int selection;
        Scanner input = new Scanner(System.in);


        System.out.println("1 - Registrar un nuevo vendedor");
        System.out.println("2 - Ingresar un nuevo vehículo");
        System.out.println("3 - Aceptar oferta");
        System.out.println("4 - Regresar");

        selection = input.nextInt();
        input.close();

        return selection;    
    
    
    }
    
    
    public static int menuComprador() {

        int selection;
        Scanner input = new Scanner(System.in);



        System.out.println("1 - Registrar un nuevo comprador");
        System.out.println("2 - Ofertar por un vehículo");

        selection = input.nextInt();
        input.close();
        
        return selection;    
    }
    
    public static int ofertaPrimera() {

        int selection;
        Scanner input = new Scanner(System.in);



        System.out.println("1 - Siguiente Oferta");
        System.out.println("2 - Aceptar oferta");

        selection = input.nextInt();
        input.close();
        
        return selection;    
    }
      public static int ofertasCompletas() {

        int selection;
        Scanner input = new Scanner(System.in);



        System.out.println("1 - Siguiente Oferta");
        System.out.println("2 - Anterior oferta");
        System.out.println("3 - Aceptar oferta");

        selection = input.nextInt();
        input.close();
        
        return selection;    
    }  
    
}

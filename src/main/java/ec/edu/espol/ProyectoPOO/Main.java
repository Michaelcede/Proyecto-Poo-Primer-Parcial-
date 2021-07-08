/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.ProyectoPOO;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import ec.edu.espol.model.*;
import java.util.Scanner;

/**
 *
 * @author jimmy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
            Scanner input = new Scanner (System.in);

            int respuesta = Menu.menuPrincipal();
            if (respuesta == 1){
                respuesta = Menu.menuVendedor();
                if(respuesta == 1){
                    //registrar nuevo vendedor
                     input = new Scanner (System.in);
                    System.out.println("Introduzca nombre");
                    String nombre = input.nextLine();
                    System.out.println("Introduzca apellido");
                    String apellido = input.nextLine();                    
                    System.out.println("Introduzca organizacion");
                    String organizacion = input.nextLine();                    
                    System.out.println("Introduzca mail");
                    String mail = input.nextLine();                    
                    System.out.println("Introduzca clave");
                    String clave = input.nextLine();
                    
                    Vendedor vendedor = new Vendedor( nombre, apellido, organizacion,  mail,  clave);
                    
                }else if(respuesta==2){
                    //ingresar un nuevo vehiculo
                    input = new Scanner (System.in);
                        System.out.println("Introduzca placa");
                        String placa = input.nextLine();
                        System.out.println("Introduzca modelo");
                        String modelo = input.nextLine();                    
                        System.out.println("Introduzca marca");
                        String marca = input.nextLine();                    
                        System.out.println("Introduzca tipoMotor");
                        String tipoMotor = input.nextLine();                    
                        System.out.println("Introduzca año");
                        int año = input.nextInt();                          
                         System.out.println("Introduzca recorrido");
                        String recorrido = input.nextLine();                          
                          System.out.println("Introduzca color");
                        String color = input.nextLine(); 
                         System.out.println("Introduzca tipoCombustible");
                        String tipoCombustible = input.nextLine(); 
                          System.out.println("Introduzca precio");
                        double precio = input.nextDouble(); 
                        
                        System.out.println("Introduzca tipo vehiculo: 0 si es auto 1 si es moto y 2 si es camioneta");
                        int tipoVehiculo = input.nextInt();
                        
                       if (tipoVehiculo == 0){ //auto
                            System.out.println("Introduzca vidrios");
                            String vidrios = input.nextLine();                          
                              System.out.println("Introduzca transmision");
                            String transmicion = input.nextLine(); 
                           Vehiculo auto = new Vehiculo (placa,  modelo,  marca,  tipoMotor,  
                           año,  recorrido,  color,  tipoCombustible,  vidrios,  transmicion,  precio);
                           
                           auto.guardarVehiculo();
                           
                       }else if (tipoVehiculo == 1){ //moto
                           Vehiculo moto = new Vehiculo( placa,  modelo,  marca,  tipoMotor,  año,  recorrido,
                            color,  tipoCombustible,  precio);
                            moto.guardarVehiculo();
                       }else if (tipoVehiculo == 2){ //camion
                            System.out.println("Introduzca vidrios");
                            String vidrios = input.nextLine();                          
                              System.out.println("Introduzca transmision");
                            String transmicion = input.nextLine(); 
                               System.out.println("Introduzca traccion");
                            String traccion = input.nextLine();                            
                              Vehiculo camion = new Vehiculo (placa,  modelo,  marca,  tipoMotor,  
                           año,  recorrido,  color,  tipoCombustible,  vidrios,  transmicion,  precio, traccion);
                              camion.guardarVehiculo();
                                                   
                           

                              
           

                        }else if(respuesta == 3){
                            
                            
                            //aceptar oferta
                            //Vehiculo vehiculo = new Vehiculo();
                            //CERO: bypass login
                            Persona persona = new Persona();
                                 input = new Scanner (System.in);
                                System.out.println("Indica tu mail");
                                String mail = input.nextLine();
                                System.out.println("Introduzca clave");
                                String clave = input.nextLine(); 
                                
                                if (persona.hacerLogin(mail, clave, 0)){
                                    //PRIMERO: Cogemos todos los vehiculos guardados
                               
                                //SEGUNDO: Los agregamos a un ArrayList haciendo un split de #

                                //TERCERO: En bucle obtenemos los vehiculos 

                                     //CUARTO: Se muestra el menu, si es la primera vez el menu de primera vez
                                        //si es la segunda vez el menu de segunda vez


                                         //Si usuario clica en siguiente oferta o en anterior oferta nos vemos al vehiculo correspondiente

                                         //Si el usuario envia una oferta entonces el vehiculo se elimina y se salta al menu principal

                                }
                               
                                        
                        }else if(respuesta == 4){
                            Menu.menuPrincipal();
                            //salir al menu principal
                }  else{
                           System.out.println("Introduzca un número correcto");
                          
                       }
            }else if(respuesta==2){
                respuesta = Menu.menuComprador();
                if(respuesta == 1){
                    //registrar nuevo comprador
                    
                     input = new Scanner (System.in);
                    System.out.println("Introduzca nombre");
                    String nombre = input.nextLine();
                    System.out.println("Introduzca apellido");
                    String apellido = input.nextLine();                    
                    System.out.println("Introduzca organizacion");
                    String organizacion = input.nextLine();                    
                    System.out.println("Introduzca mail");
                    String mail = input.nextLine();                    
                    System.out.println("Introduzca clave");
                    String clave = input.nextLine();
                    
                    Comprador comprador = new Comprador( nombre, apellido, organizacion,  mail,  clave);
                }else if(respuesta==2){
                    //ofertar por un vehiculo
                      input = new Scanner (System.in);
                    System.out.println("Introduzca placa");
                    String placa = input.nextLine();
                    System.out.println("Introduzca precio a ofertar");
                    Double precio = input.nextDouble();
                    Vehiculo vehiculo = new Vehiculo();
                    vehiculo.ofertarPorVehiculo(placa, precio);
                    
                }
            }else if(respuesta ==3){
                //salir del programa
                 System.exit(0);

            }else{
                System.out.println("Introduzca un número correcto");
            }

	}

}
}

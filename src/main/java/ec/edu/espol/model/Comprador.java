/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.util.ArrayList;

/**
 *
 * @author jimmy
 */
public class Comprador extends Persona {
            public Comprador (){
            }
            public Comprador (String nombre,String apellido,String organizacion, String mail, String clave ){
                super.nombre = nombre;
                super.apellido = apellido;
                super.clave = clave ;
                super.organizacion = organizacion ;
            }
            
            public Comprador obtenerComprador(String mail) throws Exception {
	    ArrayList datosGuardados = Generales.cargarDocumento(mail);
            Comprador comprador = new Comprador();
                this.nombre = datosGuardados.get(0).toString();
                this.apellido = datosGuardados.get(1).toString();
                this.clave = datosGuardados.get(2).toString();
                this.organizacion = datosGuardados.get(3).toString();
                
            return comprador;
	}
	}
HOLA BB ESTAS GUAPO

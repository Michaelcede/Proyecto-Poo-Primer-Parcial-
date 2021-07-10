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
public class Persona {
        protected String nombre;
	protected String apellido;
	protected String organizacion;
	protected String mail;
	protected String clave;
	
    public Persona(String nombre, String apellido, String organizacion, String mail, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.organizacion = organizacion;
        this.mail = mail;
        this.clave = clave;
    }
	
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public String getMail() {
        return mail;
    }

    public String getClave() {
        return clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
    public void guardarVendedor() throws Exception {
          ArrayList vendedor = new ArrayList();
          vendedor.add(0, this.nombre);
          vendedor.add(1, this.apellido);
          vendedor.add(2, this.clave );
          vendedor.add(3, this.organizacion);
          vendedor.add(4, this.mail);
       String nombreArchivo = "vendedor_"+this.mail+".txt";
          Generales.guardarDocumento(vendedor, nombreArchivo);
    }
    
     public void guardarComprador() throws Exception {
          ArrayList comprador = new ArrayList();
          comprador.add(0, this.nombre);
          comprador.add(1, this.apellido);
          comprador.add(2, this.clave );
          comprador.add(3, this.organizacion);
            comprador.add(4, this.mail);
        
          String nombreArchivo = "comprador_"+this.mail+".txt";
          Generales.guardarDocumento(comprador, nombreArchivo);
    }
     
     public Boolean hacerLogin(String mail, String clave, int tipo)throws Exception{ //0 = vendedor 1 = comprador
         if (tipo == 0){
             Vendedor vendedor = new Vendedor();
             vendedor.obtenerVendedor(mail);
             String mailGuardado = vendedor.getMail();
             String claveGuardada = vendedor.getClave();
             
             if ( mailGuardado == mail && claveGuardada == clave){
                 return true;
             }
                 
             
         }else if (tipo == 1){
              Comprador comprador = new Comprador();
             comprador.obtenerComprador(mail);
             String mailGuardado = comprador.getMail();
             String claveGuardada = comprador.getClave();
             
             if ( mailGuardado == mail && claveGuardada == clave){
                 return true;
             } 
         }
         return false;
     }
	
}

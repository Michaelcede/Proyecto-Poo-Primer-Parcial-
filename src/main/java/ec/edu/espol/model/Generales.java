/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author jimmy
 */
public class Generales {
    public static void guardarDocumento(ArrayList datos, String nombreFichero) throws Exception {
				//todo TRY CATCH
		
				//do something with your ArrayList 
				FileOutputStream fos =   new FileOutputStream(System.getProperty("user.dir")+nombreFichero); 
				ObjectOutputStream oos =  new ObjectOutputStream(fos) ;
				oos.writeObject(datos) ;
				oos.close() ;
				
	}
	
	public static ArrayList cargarDocumento(String nombreFichero) throws IOException {
		ArrayList datos = new ArrayList() ;
				//do something with your ArrayList 
				FileOutputStream fos =  new FileOutputStream(System.getProperty("user.dir")+"ficheroTexto.txt"); 
				ObjectOutputStream oos =   new ObjectOutputStream(fos) ;
				oos.writeObject(datos) ;
				oos.close();
				return datos;
	}


	
	public static boolean aplicarHash() {
		return true;
	}
	
	public static boolean enviarMail() {
			return true;
	
	}
    
}

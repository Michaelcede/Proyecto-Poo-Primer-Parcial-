/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;
import java.util.ArrayList;
import java.io.File;
/**
 *
 * @author jimmy
 */
public class Vehiculo {
        //vidrios (autos y camiones
        //transmisión (autos y camiones)
        //tracción (camiones)
    public Vehiculo(){}
    
    public Vehiculo(String placa, String modelo, String marca, String tipoMotor, int año, String recorrido,
            String color, String tipoCombustible, String vidrios, String transmicion, double precio){ //auto
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.tipoMotor = tipoMotor;
        this.año = año;
        this.recorrido = recorrido;
        this.color = color;
        this.tipoCombustible = tipoCombustible;        
        this.vidrios = vidrios;
        this.transmision = transmicion;
                    
    }
    
        public Vehiculo(String placa, String modelo, String marca, String tipoMotor, int año, String recorrido,
            String color, String tipoCombustible, double precio){ //moto
         this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.tipoMotor = tipoMotor;
        this.año = año;
        this.recorrido = recorrido;
        this.color = color;
        this.tipoCombustible = tipoCombustible;        

        
        
    }
        
     public Vehiculo(String placa, String modelo, String marca, String tipoMotor, int año, String recorrido,
            String color, String tipoCombustible, String vidrios, String transmicion, double precio, String traccion){ //camion
                this.placa = placa;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.tipoMotor = tipoMotor;
        this.año = año;
        this.recorrido = recorrido;
        this.color = color;
        this.tipoCombustible = tipoCombustible;        
        this.vidrios = vidrios;
        this.transmision = transmicion;
        this.traccion = traccion;           
    }

    
        private int tipoDeVehiculo = -1; //0 auto 1 moto 2 camioneta
        private String placa = "";
	private String marca = "";
	private String modelo = "";
	private String tipoMotor = ""; 
        
	private int  año = -1;
	private String recorrido = "";
	private String color = "";
	private String tipoCombustible = "";
	private String vidrios = "";
	private String transmision = "";
	private String traccion = "";
	private double precio = 0.0;

        

      public void guardarVehiculo() throws Exception {
          
          ArrayList vehiculo = new ArrayList();
          vehiculo.add(0, this.placa);
          vehiculo.add(1, this.marca);
          vehiculo.add(2, this.modelo);
          vehiculo.add(3, this.tipoMotor);
          vehiculo.add(4, this.año);
          vehiculo.add(5, this.recorrido);
          vehiculo.add(6, this.tipoCombustible);
          vehiculo.add(7, this.vidrios);
          vehiculo.add(8, this.transmision);
          vehiculo.add(9, this.traccion);
          vehiculo.add(10, this.precio);
          String nombreArchivo = "vehiculo_"+this.placa+".txt";
          Generales.guardarDocumento(vehiculo, nombreArchivo);
      }
    public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public int getAño() {
		return año;
	}

	public String getRecorrido() {
		return recorrido;
	}

	public String getColor() {
		return color;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public String getVidrios() {
		return vidrios;
	}

	public String getTransmision() {
		return transmision;
	}

	public String getTraccion() {
		return traccion;
	}

	public double getPrecio() {
		return precio;
	}

	
	public void borrarVehiculo(String nombreArchivo) {
		File file = new File(System.getProperty("user.dir")+nombreArchivo);
                file.delete();
        }
	

	
	public Vehiculo obtenerVehiculo(String placa) throws Exception {
	    ArrayList datosGuardados = Generales.cargarDocumento(placa);
            Vehiculo vehiculo = new Vehiculo();
                this.placa = datosGuardados.get(0).toString();
                this.modelo = datosGuardados.get(1).toString();
                this.marca = datosGuardados.get(2).toString();
                this.tipoMotor = datosGuardados.get(3).toString();
                this.año = Integer.parseInt(datosGuardados.get(4).toString());
                this.recorrido = datosGuardados.get(5).toString();
                this.color = datosGuardados.get(6).toString();
                this.tipoCombustible = datosGuardados.get(7).toString();       
                this.vidrios = datosGuardados.get(8).toString();
                this.transmision = datosGuardados.get(9).toString();
                this.traccion = datosGuardados.get(10).toString();
            return vehiculo;
	}
        
        public String obtenerTodosLosVehiculos(){ 
            //recoge todos los nombres de ficheros de coche y los devuelve en una cadena de texto delimitadas por coma
            String nombreArchivos = "";
             File file = new File(System.getProperty("user.dir"));
            String[] fileList = file.list();
            for(String name:fileList){
             System.out.println(name);
             nombreArchivos+="#"+name;

        }
                return nombreArchivos;
        
        }
        
        public void ofertarPorVehiculo(String placa , Double precio)throws Exception{
            Vehiculo vehiculo = obtenerVehiculo(placa);
            vehiculo.precio = precio;
            
            borrarVehiculo(placa);
            vehiculo.guardarVehiculo();
        
}

}


package archivo;

import java.util.Date;

/**
 *
 * @author FRANCISCO
 */
public class Archivo {
// Declaracion de Atrubutos de la clase Archivo y asigandas valores iniciales
    
    public String nombre ;
    public String tipoArchivo ;
    public String ubicacion ;
    
    public Date fechaCreacion ;
    public double tamaño ;
    
    Archivo(){}
    Archivo (String nombre){
    this.nombre = nombre;
    }
    
     Archivo (String nombre, String tipoArchivo){
    this.nombre = nombre;
    this.tipoArchivo =tipoArchivo;
    }
     Archivo (String nombre, String tipoArchivo, String ubicacion){
    this.nombre = nombre;
    this.tipoArchivo =tipoArchivo;
    this.ubicacion = ubicacion;
    }
     Archivo (String nombre, String tipoArchivo, String ubicacion, Date fechaCreacion){
    this.nombre = nombre;
    this.tipoArchivo =tipoArchivo;
    this.ubicacion = ubicacion;
    this.fechaCreacion =fechaCreacion;
    }
     Archivo (String nombre, String tipoArchivo, String ubicacion, Date fechaCreacion,Double tamaño){
    this.nombre = nombre;
    this.tipoArchivo =tipoArchivo;
    this.ubicacion = ubicacion;
    this.fechaCreacion =fechaCreacion;
    this.tamaño = tamaño;
    }
     //Getters
     public String getNombre(){return nombre;}
     public String getTipoArchivo(){return tipoArchivo;}
     public String getUbicacion(){return ubicacion;}
     public Date getFechaCreacion(){return fechaCreacion;}
     public Double getTamaño(){return tamaño;}
     
     //Setters
     public void setNombre(String nombre){this.nombre = nombre;}
     public void setTipoArchivo(String tipoArchivo){this.tipoArchivo = tipoArchivo;} 
     public void setUbicacion(String ubicacion){this.ubicacion = ubicacion;}
     public void setFechaCreacion(Date fechaCreacion){this.fechaCreacion = fechaCreacion;}
     public void setTamaño(Double tamaño){this.tamaño = tamaño;}
     
     
     
    public static void main(String[] args) {
      Archivo nombre = new Archivo();
      Archivo tipoArchivo = new Archivo();
      Archivo ubicacion = new Archivo();
      Archivo fechaCreacion = new Archivo("20/01/2017");
      Archivo tamaño = new Archivo("52.1Kb");
      
      nombre.setNombre("Arquitectura II");
      tipoArchivo.setTipoArchivo("PDF ");
      ubicacion.setUbicacion("Escritorio");
      //fechaCreacion.setFechaCreacion(); //no puedo asignar datos
      //tamaño.setTamaño(); //no puedo asignar datos
      
      
      
      
      
      
        System.out.println("Nombre del Archivo:  "+ nombre.getNombre());
        System.out.println("Tipo de Archivo:  "+ tipoArchivo.getTipoArchivo());
        System.out.println("Ubicacion del Archivo:  "+ ubicacion.getUbicacion());
        System.out.println("Fecha de creacion del Archivo:  "+ fechaCreacion.getFechaCreacion());//mensaje null
        System.out.println("Tamaño del Archivo:  "+ tamaño.getTamaño());//no me sale el valor dado
      
      
    }
    
}

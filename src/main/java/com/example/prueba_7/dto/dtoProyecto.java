
package com.example.prueba_7.dto;

/**
 *
 * @author alejandro
 */
public class dtoProyecto {
    
    private String nombre;
    private String fecha;
    private String descripcion;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String fecha, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}

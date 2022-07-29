
package com.example.prueba_7.dto;

/**
 *
 * @author alejandro
 */
public class dtoEducacion {
    
    private String titulo_educacion;
    private String fecha_educacion;
    private String descripcion_educacion;
    private String img_educacion;

    public dtoEducacion() {
    }

    public dtoEducacion(String titulo_educacion, String fecha_educacion, String descripcion_educacion, String img_educacion) {
        this.titulo_educacion = titulo_educacion;
        this.fecha_educacion = fecha_educacion;
        this.descripcion_educacion = descripcion_educacion;
        this.img_educacion = img_educacion;
    }

    public String getTitulo_educacion() {
        return titulo_educacion;
    }

    public String getFecha_educacion() {
        return fecha_educacion;
    }

    public void setFecha_educacion(String fecha_educacion) {
        this.fecha_educacion = fecha_educacion;
    }

    public String getDescripcion_educacion() {
        return descripcion_educacion;
    }

    public void setDescripcion_educacion(String descripcion_educacion) {
        this.descripcion_educacion = descripcion_educacion;
    }

    public String getImg_educacion() {
        return img_educacion;
    }

    public void setImg_educacion(String img_educacion) {
        this.img_educacion = img_educacion;
    }

   
}

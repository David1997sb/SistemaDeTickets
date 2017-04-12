/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadetickets;

import java.util.List;

/**
 *
 * @author Elizabeth Cano
 */
public class Tiquete extends Usuario{
    private String DescripcionProblema;
    private String Prioridad;
    private String Reporte;
    private String tecnologiaAfectada;
    private String ubicacion;
    private String fechaCreacion;

    public Tiquete(String DescripcionProblema, String Prioridad, String Reporte, String tecnologiaAfectada, String ubicacion, String fechaCreacion, String Nombre, String Apellido, int ID) {
        super(Nombre, Apellido, ID);
        this.DescripcionProblema = DescripcionProblema;
        this.Prioridad = Prioridad;
        this.Reporte = Reporte;
        this.tecnologiaAfectada = tecnologiaAfectada;
        this.ubicacion = ubicacion;
        this.fechaCreacion = fechaCreacion;
    }



    public String getDescripcionProblema() {
        return DescripcionProblema;
    }

    public void setDescripcionProblema(String DescripcionProblema) {
        this.DescripcionProblema = DescripcionProblema;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }

    public String getReporte() {
        return Reporte;
    }

    public void setReporte(String Reporte) {
        this.Reporte = Reporte;
    }

    public String getTecnologiaAfectada() {
        return tecnologiaAfectada;
    }

    public void setTecnologiaAfectada(String tecnologiaAfectada) {
        this.tecnologiaAfectada = tecnologiaAfectada;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "DescripcionProblema=" + DescripcionProblema + ", Prioridad=" + Prioridad + ", Reporte=" + Reporte + ", tecnologiaAfectada=" + tecnologiaAfectada + ", ubicacion=" + ubicacion + ", fechaCreacion=" + fechaCreacion + super.getNombre()+super.getApellido()+super.getID();
    }

   

    
   
    
} 
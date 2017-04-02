/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadetickets;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nicol
 */

public class Usuario {

    private String Nombre;
    private String Apellido;
    private int ID;
    private String DescripcionDelProblema;
    private String FechaDeCreacion;

    public void getFecha() {

        Calendar fecha = Calendar.getInstance();
        int year = fecha.get(Calendar.YEAR);
        int month = fecha.get(Calendar.MONTH) + 1;
        int day = fecha.get(Calendar.DAY_OF_MONTH);
        FechaDeCreacion = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year);
    }

    public Usuario(String Nombre, String Apellido, int ID) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescripcionDelProblema() {
        return DescripcionDelProblema;
    }

    public void setDescripcionDelProblema(String DescripcionDelProblema) {
        this.DescripcionDelProblema = DescripcionDelProblema;
    }

    @Override
    public String toString() {
        return  "Nombre: " + Nombre + ", Apellido: " + Apellido + ID ;
    }

}


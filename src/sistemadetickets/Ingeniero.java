/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadetickets;

/**
 *
 * @author Elizabeth Cano
 */
public class Ingeniero {   
    
    private String nombreIngeniero;
    private String UsuarioIng;
    private String contraseñaIng;

    public Ingeniero(String nombreIngeniero, String UsuarioIng, String contraseñaIng) {
        this.nombreIngeniero = nombreIngeniero;
        this.UsuarioIng = UsuarioIng;
        this.contraseñaIng = contraseñaIng;
    }

    public String getNombreIngeniero() {
        return nombreIngeniero;
    }

    public void setNombreIngeniero(String nombreIngeniero) {
        this.nombreIngeniero = nombreIngeniero;
    }

    public String getUsuarioIng() {
        return UsuarioIng;
    }

    public void setUsuarioIng(String UsuarioIng) {
        this.UsuarioIng = UsuarioIng;
    }

    public String getContraseñaIng() {
        return contraseñaIng;
    }

    public void setContraseñaIng(String contraseñaIng) {
        this.contraseñaIng = contraseñaIng;
    }
    
    
    
    
  
}

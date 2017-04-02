/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadetickets;

/**
 *
 * @author Nicol
 */
public enum EstadoDeTicket {
    EnProceso("En Proceso"),Activo("Activo"),Terminado("Terminado");
    private String Estado;

    private EstadoDeTicket(String Estado) {
        this.Estado = Estado;
    }
    
    public String getEstado(){
        return Estado;
    }
    
}

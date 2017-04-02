/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadetickets;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Nicol
 */
public class SistemaDeTickets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Admin x=new Admin();
        ListaUsuarios listaUsuarios = new ListaUsuarios(null,null,0);
        x.llamaUsuarios();
        
        
    }
    
}

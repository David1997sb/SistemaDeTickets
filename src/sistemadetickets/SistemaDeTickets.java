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
//        Admin x=new Admin();
       ListaUsuarios listaUsuarios = new ListaUsuarios();
       listaUsuarios.currentUsser();
//       System.out.println(listaUsuarios.getListaUsuario());
//        ListaUsuarios lists = new ListaUsuarios(null,null,0);
//        x.llamaUsuarios();
//ListaTiquete listaTiquete = new ListaTiquete();aUsuarios = new ListaUsuarios(null,null,0);
//        x.llamaUsuarios();
ListaTiquetes listaTiquete = new ListaTiquetes(null,null, null, null, null, null, null, null, 0);
//listaTiquete.fillList();
listaTiquete.CreaTiquetes(16835);
      System.out.println(listaTiquete.getListaTiquetes());
//        
//        ListaTiquete listaTiquete = new ListaTiquete();
////listaTiquete.fillList();
//listaTiquete.CreaTiquetes();
    }
    
}

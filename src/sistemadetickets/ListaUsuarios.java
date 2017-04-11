/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadetickets;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicol
 */
public class ListaUsuarios {

    public static List<Usuario> ListaUsuario;
   
    private int id = 16835;

    public ListaUsuarios() {
        
        ListaUsuario=new ArrayList<>();
    }
    


    public void currentUsser() {
        
        ListaUsuario.add(new Usuario("Pablo","Marin",id++));
        ListaUsuario.add(new Usuario("Elizabeth","Cano",id++));
        ListaUsuario.add(new Usuario("Pablo","Marin",id++));
        ListaUsuario.add(new Usuario("Pablo","Marin",id++));
       
      

        
        
        
//        ListaUsuario.add(new Usuario("David", "Salas", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Elizabeth", "Cano", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Cesar", "Melendez", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Pepe", "Beraz", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Juan", "Camacho", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Victoria", "Quintanilla", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Andrea", "Bermudez", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Johanna", "Solano", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Lidni", "Ortiz", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Rodrigo", "Solorzano", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Andrey", "Ramirez", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Maria", "Delgado", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
//        ListaUsuario.add(new Usuario("Jeylin", "Molina", cont++, JOptionPane.showInputDialog("Problema: ") + "\n"));
    }

    public void newUser() {
        ListaUsuario.add(new Usuario(( JOptionPane.showInputDialog("Nombre: ")), JOptionPane.showInputDialog("Apellido: "),id));
        System.out.println("Su ID es: " + id + "\n");
      
    }

    public void printList(int id) {
        for (Usuario p : ListaUsuario) {
            if (p.getID() == id) {
                System.out.println("Nombre: " + p.getNombre() + "\nApellido: " + p.getApellido() + "\nID:" + p.getID() + "\nProblema: " + p.getDescripcionDelProblema());
            }
            }

}

    public List<Usuario> getListaUsuario() {
        return ListaUsuario;
    }

   
    

    
    
    
    
}



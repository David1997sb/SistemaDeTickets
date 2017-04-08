/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadetickets;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elizabeth Cano
 */
public class Admin {
        private int id=16824;
        private List<ListaUsuarios>list;
        Usuario Users =new Usuario("Pablo", "Marin", id++);
        Usuario Users2 =new Usuario("Elizabeth", "Cano", id++);
        Usuario Users3 =new Usuario("Fabian", "Hernandez", id++);
        Usuario Users4 =new Usuario("David", "Salas", id++);

    public Admin() {
        list=new ArrayList<>();
        
    }
    
    public void llamaUsuarios(){
    ListaUsuarios lista= new ListaUsuarios(null, null, id);
    lista.currentUsser();
    lista.printList(16836);
    }
    public void imprimeLista(){
    }
}

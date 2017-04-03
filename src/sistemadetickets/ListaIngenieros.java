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
public class ListaIngenieros {
    private List<Ingeniero>ListIng;

    public ListaIngenieros() {
        
        ListIng=new ArrayList<>();
    }
    
    
  public void addIngeniero(){
  
  ListIng.add(new Ingeniero("Elizabeth Cano","ecano97","Quintanilla.97"));
  ListIng.add(new Ingeniero("David Salas","dsalas97","Salas.97"));
  ListIng.add(new Ingeniero("Pablo Marin","pmnarin.96","Marin.96"));
  ListIng.add(new Ingeniero("Fabian Hernández","fhernandez.97","Hernandez.97"));
 
  }
  
  
  
    
}

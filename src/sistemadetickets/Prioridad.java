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
public enum Prioridad {
  Baja("Baja"),Mediana("Mediana"),Alta("Alta");
  
  private String TipoPrioridad;

    private Prioridad(String TipoPrioridad) {
        this.TipoPrioridad = TipoPrioridad;
    }
    
    
  public String getPrioridad(){
      return TipoPrioridad;
  }
          
  
  
  
}

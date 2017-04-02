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
public enum MecanismoDeContacto {
    Telefono ("Telefono"), Correo("Correo"), Fax("Fax"),Lync("Lync");
    private String Mecanismo;

    private MecanismoDeContacto(String Mecanismo) {
        this.Mecanismo = Mecanismo;
    }
    
        

  public String getMecanismo(){
      return Mecanismo;
  }
          
}

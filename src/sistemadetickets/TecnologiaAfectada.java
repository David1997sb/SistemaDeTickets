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
public enum TecnologiaAfectada {
    Computador("Computadora"), Telefono("Telefono"),Impresora("Impresora"), Conexion("Conexion"),Aplicacion("Aplicacion");
    private String Tecnologia;

    private TecnologiaAfectada(String Tecnologia) {
        this.Tecnologia = Tecnologia;
    }
    
    
  public String getTecnologia(){
      return Tecnologia;
  }
          
}

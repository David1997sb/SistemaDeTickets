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
 * @author Elizabeth Cano
 */
public class ListaTiquetes extends Tiquete{
    
     public List<Tiquete> listaTiquete;
    
    public ListaTiquetes(String DescripcionProblema, String Prioridad, String Reporte, String tecnologiaAfectada, String ubicacion, String fechaCreacion, String Nombre, String Apellido, int ID) {
        super(DescripcionProblema, Prioridad, Reporte, tecnologiaAfectada, ubicacion, fechaCreacion, Nombre, Apellido, ID);
   
    listaTiquete=new ArrayList<>();
        
        
    }
    
      public String d() {
        return prioridadTiquete().getPrioridad();
    }

    public TecnologiaAfectada tecnologiaAfectada() {

        int option = Integer.parseInt(JOptionPane.showInputDialog("Escoja la tecnología 1.Computador 2.Telefono 3.Impresora 4.Conexión 5.Aplicación"));

        switch (option) {

            case 1:
                return TecnologiaAfectada.Computador;

            case 2:
                return TecnologiaAfectada.Telefono;
            case 3:
                return TecnologiaAfectada.Impresora;

            case 4:
                return TecnologiaAfectada.Conexion;

            case 5:
                return TecnologiaAfectada.Aplicacion;
            default:
                return TecnologiaAfectada.Computador;

        }

    }

    public Prioridad prioridadTiquete() {

        int option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la prioridad del tiquete 1.Baja 2.Mediana 3.Alta"));

        switch (option) {

            case 1:
                return Prioridad.Baja;

            case 2:
                return Prioridad.Mediana;
            case 3:
                return Prioridad.Alta;

            default:
                return Prioridad.Baja;
    }

    }

    

   
   
    public MecanismoDeContacto reporte() {

        int option = Integer.parseInt(JOptionPane.showInputDialog("Tiquete reportado por: 1.Télefono 2.Correo 3.Fax 4.Lync"));

        switch (option) {
            case 1:
                return MecanismoDeContacto.Telefono;
            case 2:
                return MecanismoDeContacto.Correo;
            case 3:
                return MecanismoDeContacto.Fax;
            case 4:
                return MecanismoDeContacto.Lync;
            default:
                return MecanismoDeContacto.Telefono;

        }

    }

     public void CreaTiquetes(int id) {
        
        super.setDescripcionProblema(JOptionPane.showInputDialog("Ingrese la descripcion"));
        super.setReporte(reporte().getMecanismo());
        super.setTecnologiaAfectada(tecnologiaAfectada().getTecnologia());
        super.setPrioridad(prioridadTiquete().getPrioridad());
        super.setFechaCreacion(JOptionPane.showInputDialog("Ingrese la fecha"));
        super.setUbicacion(JOptionPane.showInputDialog("Ingrese la Ubicacion"));
        listaTiquete.add(new Tiquete(super.getDescripcionDelProblema(), super.getReporte(), super.getTecnologiaAfectada(),  super.getPrioridad(), super.getFechaCreacion(), super.getUbicacion(), super.getNombre(), super.getApellido(), super.getID()));
          
         for (Usuario p:ListaUsuarios.ListaUsuario) {
             
             if (p.getID()== id) { 
                
              listaTiquete.add(new Tiquete(super.getDescripcionProblema(), super.getPrioridad(), super.getReporte(), super.getTecnologiaAfectada(), super.getUbicacion(), super.getFechaCreacion(), p.getNombre(), p.getApellido(), p.getID()));
             }
             
         }
//        
        
            
     
    }

      public List<Tiquete> getListaTiquetes() {
          
          return listaTiquete;
          
      }

      
      
      public void CreaTiquete(int id) {
        for (Usuario p : listaTiquete) {
            if (p.getID() == id) {
                listaTiquete.add(new Tiquete(JOptionPane.showInputDialog("Ingrese la descripción del problema:"), prioridadTiquete().getPrioridad(), reporte().getMecanismo(), tecnologiaAfectada().getTecnologia(), JOptionPane.showInputDialog("Ingrese su Ubicación"), JOptionPane.showInputDialog("Ingrese la fecha de creacion del tiquete"), p.getNombre(), p.getApellido(), p.getID()));
            }
        }
    }
    
    
    
    
    
    
}


package EjemploDos;
import EjemploDos.EjemploDos;

public class EquipoFutbol {
    public static void main (String[] args){
        EjemploDos cantidadEquipo;
        cantidadEquipo = new EjemploDos();
        cantidadEquipo.cantidad = "Existe 3 equipos de futbol"; 
        System.out.println (cantidadEquipo.cantidad);
        
        
        EjemploDos equipo1;
        equipo1 = new EjemploDos();
        equipo1.nombre1 = "El primer equipo es Deportivo Cuenca";
        System.out.println (equipo1.nombre1);
        
        EjemploDos equipo2; 
        equipo2 = new EjemploDos();
        equipo2.nombre2 = "El segundo equipo es Barcelona";
        System.out.println (equipo2.nombre2);
        
        EjemploDos equipo3;
        equipo3 = new EjemploDos();
        equipo3.nombre3 = "El tercer equipo es Real Madrid";
        System.out.println (equipo3.nombre3);
        
    }      
    
}

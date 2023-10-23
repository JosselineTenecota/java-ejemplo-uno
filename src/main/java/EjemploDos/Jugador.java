
package EjemploDos;
import EjemploDos.EjemploDos;


public class Jugador {
    public static void main (String [] args){
        EjemploDos nombre; 
        nombre = new EjemploDos();
        nombre.nombreJugador = "El nombre del jugador es Lucas Mancinelli";
        System.out.println (nombre.nombreJugador);
        
        EjemploDos apodo; 
        apodo = new EjemploDos();
        apodo.apodoJugador = "El apodo del jugador es ...";
        System.out.println (apodo.apodoJugador);
        
        EjemploDos posicion; 
        posicion = new EjemploDos();
        posicion.posicionJugador = "La posicion del jugador es delantero";
        System.out.println (posicion.posicionJugador);
    
    
    }
}

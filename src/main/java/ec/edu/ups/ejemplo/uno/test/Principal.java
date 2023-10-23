
package ec.edu.ups.ejemplo.uno.test;
import com.mycompany.ejemplouno.EjemploUno;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        EjemploUno juanitoPerez;
        juanitoPerez = new EjemploUno(); 
        //juanitoPerez.nombre = "Tu nombre es Juanito"; 
        juanitoPerez.setNombre ("Juanito");
        System.out.println (juanitoPerez.getNombre());
        EjemploUno personaUno = new EjemploUno(); 
        
        /**
        EjemploUno perez; 
        perez = new EjemploUno();
        //perez.apellido = "Tu apellido es Perez";
        perez.setApellido ("Perez");
        System.out.println (perez.getApellido);
        
        EjemploUno numero;
        numero = new EjemploUno();
        numero.setnumeroCedula = "Tu numero de cedula es 0138493746";
        System.out.println (numero.getnumeroCedula); 
       */
        
       EjemploUno personaDos = new EjemploUno ("010101","Pepito","Perez");
       System.out.println (personaDos.getNumeroCedula());
       personaDos.setNumeroCedula("020202");
       System.out.println (personaDos.getNumeroCedula()); 
       
       System.out.println (personaDos);
       
       
        //Manejo de la clase Scanner
        Scanner entrada = new Scanner (System.in);
        //Leemos un texto por teclado
        String nombre = entrada.next();
        //Mostramos el texto leido concatenando con la palabra "Hola"
        System.out.println("Hola" + nombre); 
        //Instanciamos un nuevo objeto denominando personita
        EjemploUno personita = new EjemploUno();
        //Asignamos el valor leido por teclado y asignado a la variable nombre
        personita.setNombre(nombre); 
        //Mostramos los daots del objeto personita a traves del metodo toSting
        System.out.println(personita.toString()); 
        nombre="Manuel"; 
        System.out.println (personita.toString()); 
        
        //Manejo de la clase Date
        
    }
}

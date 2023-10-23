
package com.mycompany.ejemplouno;
import java.util.Date;

public class EjemploUno {

    private String numeroCedula;
    private String nombre;
    private String apellido;
    private Date fechaNac;
    private double estatura;
    private double peso;
    
    
    //CONSTRUCTORES se ponen aqui.
    public EjemploUno (){ //es un constructor vacio porque no recibe ninguna entrada ni salida(void/main)
    }
    
    public EjemploUno (String numeroCedula, String nombre, String apellido){
        this.numeroCedula = numeroCedula;
        this.nombre = nombre;
        this.apellido = apellido; 
    }
    
    
    
    public EjemploUno(String numeroCedula, String nombre, String apellido, Date fechaNac, double estatura, double peso){ 
        this.numeroCedula = numeroCedula;
        this.nombre = nombre;
        this.apellido = apellido; 
        this.fechaNac = fechaNac;
        this.estatura = estatura;
        this.peso = peso; 
    }
    
    
    
    
    
    
    
      //Getters and setters      
            
    //para privado: metodos para asignar valores al atributo
    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    

    
    
    public int calcularEdad (Date fechaActual){
        return 0;
    }
    public double calcularIMC (){
        return 0;    
    }
    public boolean esMayorDeEdad (int limiteEdad){
        return false;
    }
    
    //toString 
    @Override
    public String toString() {
        return "Cedula:" + numeroCedula +  ",Nombre:" + nombre + ",Apellido:" + apellido; 
    }
}
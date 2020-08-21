package domain;

import java.io.Serializable;

public class Persona implements Serializable {//Para que se considere un JavaBean, implementamos la interfaz Serializable
    //1-Atributos privados
    private String nombre;
    private String apellido;
    
    //2-Constructor publico vacio
    public Persona(){
    
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //3-Metodos set y get

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
    
    
    
}

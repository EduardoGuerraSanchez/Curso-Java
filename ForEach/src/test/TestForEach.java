package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,8,9};//Vector
        
        //Definimos una variable que almacena cada uno de los valores del vector
        //La variable int edad, DOS PUNTOS y indicamos el nombre del vector
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        
        Persona personas[] = {new Persona("Juen"), new Persona("Edv")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
            
        }
        
     
     
    }
}

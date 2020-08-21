package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();//El objeto de esta linea, se transfiere a otro servidor a traves de 1 y 0 de manera automatica
        persona.setNombre("Edu");
        persona.setApellido("Guerra");
        System.out.println("Persona nombre: " + persona.getNombre());
        System.out.println("Persona apellido: " + persona.getApellido());
        
        
        
        
        
        
        
    }
    
}

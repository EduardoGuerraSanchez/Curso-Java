package test;

import domain.Empleado;

public class TestClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juen",5000);
        Empleado empleado2 = new Empleado("Juen",5000);
        //Los objetos almacenan referencias en memoria, cuando usamos new, solicitamos generar una referencia en memoria
        //Aunque tengan los mismos valores de Juen y 5000, tienen diferente referencia en memoria
        
        //Comprobar si tienen la misma referencia
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }
        else{
            System.out.println("Tienen distinta referencia en memoria");
        }
       
        //comprobar si son iguales en contenido
        
        if (empleado1.equals(empleado2) ){
            System.out.println("Los objetos son iguales en contenido");
        }
        else{
            System.out.println("Los objetos son distintos en contenido");
        }
        
        if (empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor hashcode es igual");
        }
        else{
            System.out.println("El valor hascode es distinto");
        }
    }
    
}

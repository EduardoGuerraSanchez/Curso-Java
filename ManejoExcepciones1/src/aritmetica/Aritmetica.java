package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionExcepcion/*Puede que arroje una excepcion, para eso usamos el*/ {
        //Si usamos RuntimeException en la clase de operacionExcepcion, no hace falta usarthrows OperacionExcepcion
        
        if (denominador == 0){
            //No queremos que se realice la division
            throw new OperacionExcepcion("Division entre cero");
        }
        
        return numerador / denominador;
        
    }
    
    
    
}

package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        //Excepcion aritmetica /by zero
        //int resultado = 10/0;
        //System.out.println("resultado = " + resultado);
        
        
        /*int resultado = 0;
        try{
            resultado =10/0;
        }catch(Exception variable){
            System.out.println("Ocurrio un error: ");
            variable.printStackTrace(System.out);//Imprime la pila de excepciones
        }
        System.out.println("resultado = " + resultado);//Se muestra el valor de resultado que le asignamos(0)
        */
        
        /*Cuando usamos Exception
        int resultado = 0;
        try{
            resultado =division(10, 0);
            //Ahora se va a mandar la excepcion que hemos creado
        }catch(Exception variable){
            System.out.println("Ocurrio un error: ");
            variable.printStackTrace(System.out);//Imprime la pila de excepciones
            System.out.println(variable.getMessage());//Mensaje que usamos nosotros en la otra clase
        }*/
        
        /*RuntimeException
        //Queda mas limpio el codigo
        int resultado=0;
        resultado = division(10,0);
        System.out.println("resultado = " + resultado);*/
        
        
        int resultado = 0;
        try{
            resultado =division(10, 0);
            //Ahora se va a mandar la excepcion que hemos creado
        }catch(OperacionExcepcion e){//Primero la excepcion de menor jerarquia
            System.out.println("Ocurrio un error de tipo OperacionException");
            System.out.println(e.getMessage());
        }catch(Exception variable){//Si el error es mas generico
            System.out.println("Ocurrio un error de tipo Exception: ");
            System.out.println(variable.getMessage());//Mensaje que usamos nosotros en la otra clase
        }
        finally{//Para cerrar recursos, siempre se va a ejecutar aunque haya alguna excepcion
            System.out.println("Se reviso la division entre 0");
        }
        
        
        
        
    }







    
}

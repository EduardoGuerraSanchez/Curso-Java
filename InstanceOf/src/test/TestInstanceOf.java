package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {

    public static void main(String[] args) {
        //instance of significa para determinar el tipo de lo que se esta creando new...
        //La referencia a la que esta apuntando una variable
        Empleado empleado = new Empleado("Juen", 5000);
        determinarTipo(empleado);
        
        empleado = new Gerente("JOSEPH", 585, "Lugar");
        //determinarTipo(empleado);
        
    }

    public static void determinarTipo(Empleado empleado) {//Para hacer referencia a clase padre o clase hija, llamamos a padre
        //instanceof pregunta si la variable de empleado esta apuntando en memoria es de tipo Gerente
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo GERENTE");
            //Se puede hacer de dos maneras
            //1
            Gerente gerente = (Gerente)empleado;//Conversion
            //2
            gerente.getDepartamento();
            System.out.println("gerente = " + gerente.getDepartamento());    
        }
        //Hay que poner else if, porque hace referencia solo a lo que se encuentra en memoria, pero realmente si no usamos el else, 
        //la variable hace referencia tanto a Gerente, Empleado y Object
        else if (empleado instanceof Empleado){
            System.out.println("Es de tipo EMPLEADO");
            System.out.println("empleado = " + empleado.getNombre());
        }
        else if (empleado instanceof Object){
            System.out.println("Es de tipo OBJECT");
            empleado.toString();
        }
    }
}

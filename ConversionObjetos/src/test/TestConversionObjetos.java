package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        Gerente gerente = new Gerente("Nombre", 0, "Departamento");//No uso el tipo de escritura porqie no lo tiene establecido como atributo
   
        empleado = new Escritor("Juen",4949,TipoEscritura.CLASICO);
    
       // System.out.println("empleado = " + empleado);
        
       //Con la variable de la clase padre, llamamos a los metodos de las clases hijas, hemos llamado a/los metodos que tienen en comun (obtenerDetalles)
       //Si cambio el nombre de alguna, no haya Override, y a la hora de mostrarlo por pantalla, no se vera el metodo que tiene nombre diferente
        System.out.println(empleado.obtenerDetalles());
        //empleado.getTipoEscritura(); No puedo acceder poruqe no esta en comun en Empleado y en Escritor
        //Para poder hacerlo, habra que hacer una conversion de objetos
        //Downcasting
        ((Escritor)empleado).getTipoEscritura();//Estamos haciendo una referencia de tipo padre a tipo hijo, esto es downcasting
        //Lo mismo
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado2 = escritor;//Asignar una variable de tipo hija a una variable de tipo padre
        System.out.println(empleado2.obtenerDetalles());
        
        
    }
    
}

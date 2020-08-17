package test;

import domain.Empleado;
import domain.Gerente;

public class Test {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juen",5000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);

       Gerente gerente = new Gerente("Karla",1000,"Contabilidad");
        //System.out.println("gerente = " + gerente.obtenerDetalles());
         imprimir(gerente);
         
        //Podemos usar la misma variable de tipo empleado, ya que puede almacenar referencias de objetos de tipo hijo 
        empleado = new Gerente("JOSEPH",585,"Lugar");
        imprimir(empleado);
    }
    
    
    public static void imprimir(Empleado empleado){//Para hacer referencia a clase padre o clase hija, llamamos a padre
        System.out.println("empleado = " + empleado.obtenerDetalles());   
    }
}

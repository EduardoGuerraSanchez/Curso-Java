package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {
  
    public ClaseHija(){
        super();//Llamamos al constructor protegido de la clase Padre
        this.atribtutoProtected = "Modificacion atributo protected";
        System.out.println("AtributoProtegido" + this.atribtutoProtected);
        this.metodoProtected();
    }
}

package genericos;

public class ClaseGenerica<T> {//Indica tipo generico, no sabemos de que tipo es

private T objeto;

public ClaseGenerica(T objeto){
    this.objeto=objeto;
}

public void obtenerTipo(){
    System.out.println("El tipo T es: " + this.objeto.getClass().getSimpleName());
}
    
}

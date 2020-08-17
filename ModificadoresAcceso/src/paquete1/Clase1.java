package paquete1;

public class Clase1 {
    protected String atribtutoProtected = "Valor Atributo protected";
    
    protected Clase1(){
        System.out.println("Constructor protected");
    }
    public Clase1(String arg){
        System.out.println("ConstructorPublico");
    }
    
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }

}

package excepciones;

public class OperacionExcepcion extends RuntimeException  {//Para que extienda de Exception / RuntimeException
   //Nuestra propia clase de excepcion
    public OperacionExcepcion(String mensaje){
        super(mensaje);//De la clase padre
    }
}

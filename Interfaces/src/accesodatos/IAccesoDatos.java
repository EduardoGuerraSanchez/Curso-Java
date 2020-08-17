package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTRO = 10;    
    
    //Se agrega automaticamente public abstract aunque no lo pongamos
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
}

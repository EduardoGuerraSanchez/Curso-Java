package mx.com.gm.ventas;

public class Producto {
    private final int idProducto;//Identificador del producto
    private String nombre;//Nombre del producto
    private double precio;//Precio del producto
    private static int contadorProducto;//Numero del producto
    
    private Producto(){
        this.idProducto = ++Producto.contadorProducto;//Añado un producto por cada vez que creo un Producto diferente
    }
    public Producto(String nombre, double precio){
        this();//Llamamos al constructor privado y se inicializa la variable idProducto
        this.nombre = nombre;
        this.precio = precio;        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

    
    
    
    
    
}

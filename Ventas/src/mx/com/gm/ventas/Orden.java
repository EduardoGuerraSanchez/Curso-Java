package mx.com.gm.ventas;

public class Orden {
    private int idOrden;//Identificador de la orden
    private Producto productos[];//Vector que contiene CADA UNO DE LOS PRODUCTOS
    private static int contadorOrdenes;//Numero que indica la orden
    private int contadorProductos;//Numero que indica la cantidad de productos que se añaden al vector
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
        System.out.println("Iniciando constructor por defecto...");
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];//Al ser static, uso el Orden
    }
    
    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }
        else{
            System.out.println("Se ha superado el maximo de productos");
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos ; i++) {
            Producto producto = this.productos[i];
            total += producto.getPrecio();
            // Sustituye a las 2 lineas anteriores: total += this.productos[i].getPrecio();  //Nos regresa el objeto de tipo Producto
            
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden: $" + totalOrden);
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);//Nos devuelve el objeto de tipo Producto
        }
    }
    
}

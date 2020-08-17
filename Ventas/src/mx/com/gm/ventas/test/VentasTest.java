package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;//Para añadir todas las clases

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        Producto producto3 = new Producto("Boina", 49.3);
    
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto1);
        
        orden2.mostrarOrden();
    
    
    }
}

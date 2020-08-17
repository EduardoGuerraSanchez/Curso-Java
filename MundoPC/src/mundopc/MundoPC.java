package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",20);
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("USB","HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
         
        Monitor monitorACER = new Monitor("ACER",40);
        Teclado tecladoACER = new Teclado("Bluetooth","ACER");
        Raton ratonACER = new Raton("USB","ACER");        
        Computadora computadoraACER = new Computadora("Computadora ACER", monitorACER, tecladoHP, ratonACER);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraACER);
        
        orden1.mostrarOrden();
    }
}

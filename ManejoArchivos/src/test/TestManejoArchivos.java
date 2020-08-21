package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
                            //ruta-> c:\\carpata\\prueba.txt
        
        //crearArchivo(nombreArchivo); comentamos porque ya lo hemos creado
        //escribirArchivo(nombreArchivo,"Hola desde Java");
        //escribirArchivo(nombreArchivo,"Adios");//Cada vez que escribimos inf, se pierde la anterior, la estamos sobreescribiendo
        //anexarArchivo(nombreArchivo,"Hola desde Java");
        //anexarArchivo(nombreArchivo,"Adios");
        
        leerArchivo(nombreArchivo);
        
        
        
        
    }







    
}

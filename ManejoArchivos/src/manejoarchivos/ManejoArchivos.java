package manejoarchivos;

import java.io.*;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);//Objeto de tipo File en memoria
        try {
            //Para que se guarde en memoria
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();//Cerramos el archivo que se abrio, se crea el archivo en nuestro disco duro
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);//Objeto de tipo File en memoria
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);//Escribimos la informacion
            salida.close();//Cerramos el flujo
            System.out.println("Se ha escrito el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));//Usamos una clase intermedia para anexar el contenido, le pasamos el archivo y un booleano para saber si se anexa el contenido
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        //FileReader no lee lineas completas, BufferedReader si
        try {
            var entrada = new BufferedReader(new FileReader(archivo));  //Podemos leer lineas completas, osea almacenamos caracter a caracter
            String lectura = entrada.readLine();
            while(lectura != null){
                System.out.println("lectura = " + lectura);//Imprimimos lo que tenemos en lectura
                lectura = entrada.readLine();//Para leer lineas completas
            }
            entrada.close();//Cerramos el flujo de BufferedReader
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
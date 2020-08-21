package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<String>();
        //Izquierda-Indicamos con el tipo que vamos a trabajar, la interface va a usar String
        //Derecha-Indicamos el tipo con el que vamos a crear nuestro objeto de tipo ArrayList,indicamos la sintaxis
        //Derecha-No hace falta indicarla
        
        miLista.add("Lunes");//Solo permite String
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        //Conversion, ya no hace falta, ya que el get, en vez de regresar un Object, regresa un String
        //String elemento = (String)miLista.get(0);

        String elemento = miLista.get(0);
        //imprimir(miLista);
        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        //imprimir(miSet);
        
        Map<String,String> miMapa = new HashMap<>();
        
        miMapa.put("valor1", "Juen");
        miMapa.put("valor2", "Edv");
        miMapa.put("valor3", "Ike");
        miMapa.put("valor3", "Carlos");
        String elementoMapa = miMapa.get("valor3");//No se duplica las llaves
        System.out.println("elementoMapa = " + elementoMapa);
        //imprimir(miMapa.keySet());
        //imprimir(miMapa.values());
        
        
        
    }

    public static void imprimir(Collection<String> coleccion){
//        coleccion.forEach(elemento -> {
//            System.out.println("elemento: " + elemento);
//        }); 
        for (String elemento: coleccion){
            System.out.println("elemento = " + elemento);
        }
    }
}

package manejocolecciones;

import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {
        //List es una interface
        //No podemos crear objetos de tipos interface
        //Usamos una clase que implementa esta interface ArrayList
        List miLista = new ArrayList();
        miLista.add("Cadena");
        miLista.add(2);
        miLista.add(3);
        miLista.add(3);
       //imprimir(miLista);
        
        Set miSet = new HashSet();//Implementa la clase HashSet
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");//Como hay un elemento duplicado, no lo acepta
       //imprimir(miSet);//La interface Set, hereda de Collection
        
        Map miMapa = new HashMap();//Maneja el concepto de llave,valor
        miMapa.put("Llave", "Valor");//(Llave,valor)
        miMapa.put("Valor1", "Juen");
        miMapa.put("Valor2", "Edv");
        miMapa.put("Valor1", "Rosario");//El elemento duplicado sustituye al valor agregado previamente
        //imprimimos las llaves
        //imprimir(miMapa.keySet());
        //imprimir valores
        //imprimir(miMapa.values());
        //Solo una llave
        System.out.println(miMapa.get("Valor2"));      
    }
    
    
    private static void imprimir(Collection coleccion ){//Collection, interfaz PADRE
        //Este tipo Collection va a poder apuntar a todos los tipos que vamos a usar
        //Como ArrayList, ya que implementa la interface List
        //Y a su vez List hereda de Collection
        
        for(Object elemento: coleccion){
            System.out.println("elemento: " + elemento);
        }
        System.out.println("");   
    }



    
}

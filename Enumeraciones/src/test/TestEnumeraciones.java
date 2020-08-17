package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        /*System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.MIERCOLES);*/
        
        System.out.println("Contienente numero 4: " + Continentes.AMERICA);
        System.out.println("Numero de Paises en el cuarto contienente: " + Continentes.AMERICA.getPaises());
        
        System.out.println("Contienente numero 1: " + Continentes.AFRICA);
        System.out.println("Numero de Paises en el primer contienente: " + Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){//Al tener en el switch la enumeracion de dias, no hace falta poner dias.LUNES
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
        }
    }
    
    
}

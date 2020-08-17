package domain;

public class Persona {
    //Los bloques se llaman antes que al constructor, pueden ser estaticos o no estaticos
    private final int idPersona;
    private static int contadorPersonas;
    
    static{//Bloque de inicializacion estatico
        //Iniciar variables static, al ser variables estaticas, no se puede usar this.
        System.out.println("Ejecucion bloque estatico...");
        ++Persona.contadorPersonas;
        //Solo se ejecuta cuando lo reservemos en memoria (new)
    }
    {//Bloque de inicializacion NO ESTATICO, se inicia despues del estatico
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
        //Se ejecuta cada vez que vayamos a crear un objeto
    }
    
    public Persona(){//Antes de que se ejecute esto, ya se ha llamado a los 2 bloques anteriores
        System.out.println("Ejecucion del constructor");
        
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
}

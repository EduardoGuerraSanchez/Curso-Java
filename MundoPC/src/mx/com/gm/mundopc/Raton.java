package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        this.idRaton = ++Raton.contadorRatones;//Primero se incrementa 
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() + '}';//super porque es de la clase padre,toString para imprimir la informacion de la clase padre
    }
    
    
    
    
}

package domain;

public class Rectangulo extends FiguraGeometrica {
    
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){//getClass, para regresar el tipo de la clase
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
    
}

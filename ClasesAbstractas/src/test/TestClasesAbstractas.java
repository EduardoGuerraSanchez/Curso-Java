package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //No podemos crear objetos de una clase abstracta
        //FiguraGeometrica figura = new FiguraGeometrica();
    
        //Creamos un objeto de tipo Rectangulo, pero le asignamos un objeto de tipo FiguraGeometrica
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        
        figura.dibujar();//Se ejecuta el de la clase hija, porque el padre es abstracto
    }
    
}

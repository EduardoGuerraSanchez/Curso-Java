package test;

public class TestAutoBoxingUnboxing {
    public static void main(String[] args) {
        //Clases Envolventes de tipos primitivos
        //int -- Integer
        //long - Long
        //float -- Float
        //double -- Double
        //boolean -- Boolean
        //byte -- Byte
        //char -- Character
        //short -- Short
        
        //Autoboxing
        //Envolvemos el tipo primitivo, en un tipo object
        Integer entero = 10;//El tipo entero, se convierte en un objeto
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        System.out.println("entero = " + entero.doubleValue());
        
        //Unboxing
        int entero2 = entero;//Extraemos el valor de tipo primitivo de nuestro object,y lo asignamos a nuestra variable de tipo primitivo 
        System.out.println("entero2 = " + entero2);
                    
        
    }
    
}

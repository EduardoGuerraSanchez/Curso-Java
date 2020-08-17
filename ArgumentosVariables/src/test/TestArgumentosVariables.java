package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(2,1,5,7,8,2,4,4);
        variosParametros("JUEN",8,4,3,1,5,76,8,545443143);
    }

    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: "+numeros[i]);
        }
    }
}

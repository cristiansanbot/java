
package main;

public class App {

    public static void main(String[] args) {
        
        System.out.println("Cantidad de argumentos= "+args.length);
        System.out.println("Lista de argumentos: ");
        
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]+" ");
        }

        for (String miVariable : args) {
            System.out.println(miVariable + " ");
        }
        
        int[] miArreglo = {12,9,8,7,6};
        
        for (int valor : miArreglo){
            System.out.println(valor);
        }        
    }
}

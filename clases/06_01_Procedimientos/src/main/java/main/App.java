
package main;

import java.util.Scanner;

public class App {

    public static void imprimirAsteriscos(int cantidadAsteriscos){
        for (int i = 1; i <= cantidadAsteriscos; i++) {
            System.out.print("*");
        }
    }
    
    public static void imprimirLinea(int cantidad, String caracter){
        for (int i = 1; i < cantidad; i++) {
            System.out.print(caracter.charAt(0));
        }
    
    
    }
    
    public static void main(String[] args) {
        int c;
        String miCaracter;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un valor entero: " );
        c= entrada.nextInt(); entrada.nextLine();
        
        imprimirAsteriscos(c);
        
        System.out.println("");
        System.out.print("Ingresa un valor entero: " );
        c= entrada.nextInt(); entrada.nextLine();
        System.out.print("Ingresa un caracter: ");
        miCaracter= entrada.nextLine();
        
        imprimirLinea(c,miCaracter);
        
    }


}

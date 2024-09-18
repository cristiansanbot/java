
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
    
    public static double areaRectangulo(double largo, double ancho){
        double area= largo* ancho;
        return area;
    }
    
    public static double perimetroRectangulo(double largo, double ancho){
        return largo*2+ancho*2;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double l, a, p, pp;
      
        System.out.print("Largo >> ");
        l=entrada.nextDouble(); entrada.nextLine();
        System.out.print("Ancho >> ");
        a=entrada.nextDouble(); entrada.nextLine();
    
        p=areaRectangulo(l,a);
        pp=perimetroRectangulo(l,a);
        
        System.out.println("AREA= "+p);
        System.out.println("PERIMETRO= "+pp);
    }
}


package main;

import java.util.Scanner;

public class App {

    static double area, perimetro, largo, ancho;
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Largo >> ");
        largo=entrada.nextDouble(); entrada.nextLine();
        System.out.print("Ancho >> ");
        ancho=entrada.nextDouble(); entrada.nextLine();
    
        area=areaRectangulo(largo,ancho);
        perimetroRectangulo(largo,ancho);
        
        System.out.println("AREA= "+area);
        System.out.println("PERIMETRO= "+perimetro);
    }
    
    
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
    
    public static void perimetroRectangulo(double largo, double ancho){
        App.perimetro= largo*2+ancho*2;
    }
    

}

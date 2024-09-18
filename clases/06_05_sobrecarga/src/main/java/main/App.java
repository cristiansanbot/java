

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
        
        String lectura = "";
        
        do {
            System.out.println("Ingresa un entero >>");
            lectura = entrada.nextLine();
        } while (!esEntero(lectura));
        
        int miEntero= Integer.parseInt(lectura);
        
        System.out.println(miEntero);
        
        do {
            System.out.println("Ingresa un float >>");
            lectura = entrada.nextLine();
        } while (!esFloat(lectura));
    }
    
    
    public static boolean esEntero(String valor){
        if (valor.length()==0) {
            return false;
        } 
        
        for (int i = 0; i < valor.length(); i++) {
            if ((valor.charAt(i)<'0') || (valor.charAt(i)>'9')) {
                return false;
            }
        }
        
        return true;
    }

    static boolean decimal=false;
    static boolean cantdeci=false;
    
    public static boolean esFloat(String valor){
        if (valor.length()==0||valor.length()<=2) {
            return false;
        } 
        decimal=false;
        cantdeci=false;
        for (int i = 0; i < valor.length(); i++) {

            if ((i<(valor.length()-1))&&((valor.charAt(i)=='.')||(valor.charAt(i)==','))&&(cantdeci==false)) {
                decimal=true;
                cantdeci=true;
            } else {
                if ((valor.charAt(i)<'0') || (valor.charAt(i)>'9')) {
                    return false;
                }
            
            }
        }
        
        return decimal==true && cantdeci==true;
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

    public static int areaRectangulo(int largo, int ancho){
        return largo* ancho;
    }
    
    public static void perimetroRectangulo(double largo, double ancho){
        App.perimetro= largo*2+ancho*2;
    }
    
    public static int perimetroRectangulo(int largo, int ancho){
        return largo*2+ancho*2;
    }
    

}

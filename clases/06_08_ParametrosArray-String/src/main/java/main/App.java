/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author crist
 */
public class App {

    public static Scanner entrada = new Scanner(System.in);
    public static AtomicInteger area = new AtomicInteger(0); 
    public static StringBuilder mensajeArea=new StringBuilder("Aun no inicalizado");
    
    public static int[] miArreglo, arregloInvertido;
    
    
    public static void main(String[] args) {
    
    //    imprimir("Ingresa tu nombre: ");
    
    /*
        System.out.print("Ingresa el largo >>");
        int largo= entrada.nextInt(); entrada.nextLine();
        System.out.print("Ingresa el ancho >>");
        int ancho= entrada.nextInt(); entrada.nextLine();
    
        while(!areaRectangulo(largo,ancho,mensajeArea,area)){
            System.out.println(mensajeArea);

            System.out.print("Ingresa el largo >>");
            largo= entrada.nextInt(); entrada.nextLine();
            System.out.print("Ingresa el ancho >>");
            ancho= entrada.nextInt(); entrada.nextLine();
        }
        
        System.out.println("AREA = "+area.get());
    */
    
        miArreglo= new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(miArreglo));
        arregloInvertido= inverso(miArreglo);
        System.out.println(Arrays.toString(arregloInvertido));
        
        invertir(miArreglo);
        System.out.println(Arrays.toString(miArreglo));
        
    }
    
    public static int[] inverso(int[] arreglo){
        int[] retorno = new int[arreglo.length];
        for (int i = arreglo.length-1; i >= 0; i--) {
            retorno[arreglo.length-i-1]=arreglo[i];
        }
        return retorno;
    }
    
    public static void invertir(int[] arreglo){
        int[] retorno = new int[arreglo.length];
        for (int i = arreglo.length-1; i >= 0; i--) {
            retorno[arreglo.length-i-1]=arreglo[i];
        }
        System.arraycopy(retorno, 0, arreglo, 0, arreglo.length);
    }
    
    
    /*
    public static boolean areaRectangulo(int l, int a, StringBuilder mensaje, AtomicInteger area){
        mensaje.delete(0, mensaje.length());
        
        if (l <=0 && a<=0) {
            mensaje.append("Error: Largo y ancho son incorrectos. Ingresa valores mayores a 0.");
            area.set(0);
            return false;
        } else if(l<=0 && a>0){
            mensaje.append("Eror: El largo es incorrecto. Ingresa un valor mayor a 0.");
            area.set(0);
            return false;
        } else if(l>0 && a<=0){
            mensaje.append("Eror: El ancho es incorrecto. Ingresa un valor mayor a 0.");
            area.set(0);
            return false;
        } else {
            mensaje.append("Valores correctos");
            area.set(l*a);
            return true;
        }
        

    }
    */
    
    
    /*
    public static void imprimir(String s){
            System.out.print(s);
    } 
    */
}

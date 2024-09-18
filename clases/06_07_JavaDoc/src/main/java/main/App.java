

package main;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *  Esta calse ejemplifica el uso de parametros.
 * @author cristian
 */
public class App {


    public static int x,y;
    public static AtomicInteger a;
    
    
    /**
     * Realiza el calculo del area demostrando el uso de parametros en Java.
     * @param args 
     */
    public static void main(String[] args) {
        a= new AtomicInteger(0);
        System.out.println("a= "+a.get());
        
        /*
        Asigno valores a las variables x e y.
        Esto es para probar
        */
        x=5; //Valor para x
        y=6; //Valor para y
        
        if (areaRectangulo(x,y,a)) {
            System.out.println("a= "+a.get());
            System.out.println("x= "+x);
            System.out.println("y= "+y);
        } else {
            System.out.println("No son valores correctos");
        }
        
    }
    
    /**
     * Se retorna TRUE si los valor <b>largo</b> y <b>ancho</b> son ambos mayores que 0.
     * En tal caso ademas se retorna el valor del area en el parametro area.
     * Si largo y ancho resultan menores que 0, se retorna FALSE y area valdra 0.
     * @param largo El largo del rectangulo
     * @param ancho El ancho del rectangulo
     * @param area El resultado final del area; 0 si largo y ancho no son adecuados.
     * @return TRUE si largo y ancho son ambos mayores que 0, FALSE en caso contrario
     * "see AtomicInteger
     */
    
    
    public static boolean areaRectangulo(int largo, int ancho, AtomicInteger area){
        if ((largo>0)&&(ancho>0) ) {
            area.set(largo*ancho);
            largo=0;
            ancho=0;
            
            return true;
            
        }
        
        area.set(0);
        return false;
    }
    
}

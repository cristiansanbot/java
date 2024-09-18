
package main;

import java.util.concurrent.atomic.AtomicInteger;

public class App {

    public static int x,y;
    public static AtomicInteger a;
    
    
    
    public static void main(String[] args) {
        a= new AtomicInteger(0);
        System.out.println("a= "+a.get());
        
        x=5;
        y=6;
        
        if (areaRectangulo(x,y,a)) {
            System.out.println("a= "+a.get());
            System.out.println("x= "+x);
            System.out.println("y= "+y);
        } else {
            System.out.println("No son valores correctos");
        }
        
    }
    
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

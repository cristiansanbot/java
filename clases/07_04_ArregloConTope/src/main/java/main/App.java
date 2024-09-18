package main;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static final int MAX_CELDAS=100;
    
    public static record TopArray(
        int[] arreglo,
        AtomicInteger tope
    ){}
    
    
    /**
     * Crea un arreglo vacio
     * @return Retorna el arreglo creado.
     */
    public static TopArray iniciarArreglo(){
        return new TopArray(new int[MAX_CELDAS], new AtomicInteger(-1));
    }
    
    
    /**
     * Retorna TRUE si el arreglo esta vacio, FALSE si no.
     * @param a El arreglo a ser evaluado. 
     * @return TRUE si esta vacio, FALSE si no.
     */
    public static boolean esVacio(TopArray a){
        return a.tope.get()==-1;
    }
    
    
    /**
     * Retorna TRUE si el arreglo esta completo, es decir, si tiene MAX_CELDAS
     * elementos, FALSE si no.
     * @param a El arreglo a ser evaluado.
     * @return TRUE si esta completo, FALSE si no.
     */
    public static boolean esCompleto(TopArray a){
        return a.tope.get()==MAX_CELDAS-1;
    }
    
    
    /**
     * Agrega al arreglo el elemento n pasado como argumento. Dicho elemento se
     * agrega al final del arreglo. <br><br>
     * <b>PRECONDICION: </b> el arreglo no debe estar lleno.
     * @param n El numero a ser agregado.
     * @param a El arreglo en el cual se ingresara el numero.
     */
    public static void add(int n, TopArray a){
        a.tope.set(a.tope.get()+1);
        a.arreglo[a.tope.get()]=n;
    }
    
    
    /**
     * Imprime en la salida los elementos de a en formato: <br>
     * X1 X2 X3... Xn<br><br>
     * Si el arreglo esta vacio no hace nada.
     * @param a El arreglo a imprimir.
     */
    public static void imprimir(TopArray a){
        for (int i = 0; i <a.tope.get(); i++) {
            System.out.print(a.arreglo[i]+" ");
        }
    }
    
    
    /**
     * Remueve la primera ocurrencia de n en el arreglo a. Si n no existe en el 
     * arreglo no se hace nada.
     * @param n El valor cuya primera ocurrencia sera eliminada.
     * @param a El arreglo a eliminar n.
     */
    public static void remove(int n, TopArray a){
        
    }
    
    /** Remueve todas las ocurrencias de n en a. Si n no existe en el arreglo
     * no se hace nada.
     * @param n El valor a ser removido.
     * @param a El arreglo del cual se removera n.
     */
    public static void removeAll(int n, TopArray a){
        
    }
    
    
    /**
     * Cantidad de elementos en a. 
     * @param a El arreglo cuya cantidad de elementos se desea conocer.
     * @return La cantidad de elementos guardados en a.
     */
    public static int cantidad(TopArray a){
        return a.tope.get()+1;
    }
    
    public static void main(String[] args) {
        TopArray miArreglo = iniciarArreglo();
        Random generador = new Random();
        int cantidad = generador.nextInt(10)+1;
        
        System.out.println("Se van a agregar "+cantidad+" numeros al arreglo.");
        do {
            add(generador.nextInt(10)+1, miArreglo);
        } while (cantidad(miArreglo)<=cantidad);
        
        imprimir(miArreglo);
    }
}

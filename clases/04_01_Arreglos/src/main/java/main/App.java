
package main;
import java.util.Arrays;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        String arr[] = {"Hola","Mundo","Java"}, arr2[]={"H","M","J"};
        int miArreglo[]= new int[12];
        int arri2[]= new int[12];
        int valor=1;
        
        int largo;
        Scanner entrada = new Scanner(System.in);
        largo= entrada.nextInt();
        
        double[] arr1= new double[largo];
        
        System.out.println(args.length);
        
        
        for(int i=0; i<12;i++){
            miArreglo[i]=valor;
            arri2[i] =valor;
            valor++;
        }
        
        for(int i=0; i<12;i++){
            System.out.print(miArreglo[i]+" ");
        }
        
        if(Arrays.equals(miArreglo, arri2)){
           System.out.println("Iguales1");
        } else{
            System.out.println("Distintos2");
        }
        
        
        
        if(miArreglo==arri2){
            System.out.println("Iguales");
        } else{
            System.out.println("Distintos");
        }
        
    }
}

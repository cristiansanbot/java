
package ejecutable;

import java.util.Scanner;

public class Lector {
    public static void main (String[] args){
        String nombrePersona, nombrePersona2, nombrePersona3;
        int edadPersona, edadPersona2, edadPersona3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        nombrePersona = entrada.nextLine();
        System.out.print("Ingresa tu edad: ");
        edadPersona = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.print("Ingresa otro nombre: ");
        nombrePersona2 = entrada.nextLine();
        System.out.print("Ingresa otra edad: ");
        edadPersona2 = entrada.nextInt();

        entrada.nextLine();
        
        System.out.print("Ingresa otro nombre: ");
        nombrePersona3 = entrada.nextLine();
        System.out.print("Ingresa otra edad: ");
        edadPersona3 = entrada.nextInt();

        
        System.out.println("Hola "+nombrePersona+", tienes "+edadPersona+" años.");
        System.out.println("Hola "+nombrePersona2+", tienes "+edadPersona2+" años.");        
        System.out.println("Hola "+nombrePersona3+", tienes "+edadPersona3+" años.");        
    
    }
}

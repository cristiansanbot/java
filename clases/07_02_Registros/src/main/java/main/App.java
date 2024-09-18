/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author crist
 */
public class App {

    public static record Persona(StringBuilder nombre, StringBuilder apellido, AtomicInteger edad){};
    
    
    public static void main(String[] args) {
        Persona p;
        String n, a;
        byte e;
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa tu nombre >> ");
        n=consola.nextLine();
        System.out.print("Ingresa tu apellido >> ");
        a=consola.nextLine();
        System.out.print("Ingresa tu edad >> ");
        e=consola.nextByte(); consola.nextLine();
        
        p = new Persona(new StringBuilder(n),new StringBuilder(a),new AtomicInteger(e));
        System.out.println(p.nombre+" "+p.apellido+" "+p.edad);
        
        p.edad.set(38);
        p.nombre.delete(0, p.nombre.length());
        p.nombre.append("Juan");
        
    }
}

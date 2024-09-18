
package main;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author crist
 */
public class Project5 {
        public static final byte MAX_INTENTOS = 10;
        public static final byte LARGO_CODIGO = 5;
        public static final char PRIMERA_LETRA = 'A';
        public static final char ULTIMA_LETRA = 'H';
        public static boolean[] evaluadasP= new boolean[LARGO_CODIGO],
         evaluadasA= new boolean[LARGO_CODIGO];
        
        public static int rango = (int)ULTIMA_LETRA - (int)PRIMERA_LETRA;
        public static int a;
        public static char apoyo;
        public static final Random sorteo = new Random();
        public static final Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        String[] tocheck;
        AtomicInteger jugando= new AtomicInteger(1);
        AtomicInteger resultado= new AtomicInteger(0);
        AtomicInteger b= new AtomicInteger(0);
        AtomicInteger r= new AtomicInteger(0);
        
        for (int i = 0; i < LARGO_CODIGO; i++) {
            evaluadasP[i]= false;
            evaluadasA[i]= false;
        }
        
        char[] check = generarCodigo();
        
        for (int i = 0; i < LARGO_CODIGO; i++) {
            System.out.print(check[i]);
        }
        
        a=0;       
        System.out.println("");
        System.out.println("Dispones de 10 intentos para adivinar el codigo.");
        
        
        
        while(jugando.get()==1){

            b.set(0);
            r.set(0);
            for (int i = 0; i < LARGO_CODIGO; i++) {
                evaluadasP[i]= false;
                evaluadasA[i]= false;
            }
            System.out.print("Codigo "+(a+1)+" de 10>>");
            System.out.println("Ingresa: ");
            tocheck = (entrada.nextLine()).split("");

            
            
            while(!leerCodigo(tocheck)){
                System.out.println("ERROR: El codigo no es valido. Ingresa otro con "+ LARGO_CODIGO +" letras entre " +PRIMERA_LETRA +" y " +ULTIMA_LETRA+" >> ");
                tocheck = (entrada.nextLine()).split("");
                
                
            }

            calcularNota(check, tocheck, b, r);

            if(b.get()==LARGO_CODIGO){
                    jugando.set(0);
                    resultado.set(1);
                }


                a++;
                if(MAX_INTENTOS==a){
                jugando.set(0);
                }
            }
        if(resultado.get()==1){
            System.out.println("EXCELENTE!!! Ganaste.");
        } else {
            System.out.print("PERDISTE!!! el codigo era ");
            imprimirCodigo(check);
        }
        
    }

    /**
    * Genera un código al azar y lo asigna a la variable codigo. El codigo generado
    * puede contener letras repetidas.
    * @return Un código de LARGO_CODIGO caracteres generados aleatoriamente.
    */
    public static char[] generarCodigo(){
        char[] check = new char[LARGO_CODIGO];

        for (int i = 0; i < LARGO_CODIGO; i++) {
            apoyo=(char)(sorteo.nextInt(rango)+((int)PRIMERA_LETRA));
            check[i] = apoyo;
        }         

        return check;
    }


    /** Lee el codigo de la entrada estandar y lo asigna a la variable codigo. Ademas
    * retorna el valor TRUE si el codigo leido es correcto, FALSE si no.
    * El codigo leido puede ser incorrecto si:<br>
    * <ul><li>Contiene uno o más caracteres fuera del rango [PRIMERA_LETRA,ULTIMA_LETRA].</li>
    * <li>No contiene el largo LARGO_CODIGO</li>
    * </ul>
    * @param codigo Contendrá el código leído desde la entrada. Si hay un error
    * no se garantiza la consistencia del mismo. Verificar, para ello, el retorno
    * de esta operación.
    * @return true si el código cumple con las condiciones, false en caso contrario.
    */
    public static boolean leerCodigo(String[] codigo){
        if(codigo.length <=LARGO_CODIGO-1){
            return false;
        } else{
            for (String i : codigo) {
                if ((int) ((char) i.codePointAt(0)) > (int)ULTIMA_LETRA) {
                    return false;
                }
            }
            
            return true;
        }
    }


    /**
    * Imprime en la salida estándar el código pasado como argumento. Deja el
    * cursor al final de la impresión si generar una nueva línea.
    * @param codigo El código que se desea imprimir.
    */
    public static void imprimirCodigo(char[] codigo){
        for(char x:codigo){
            System.out.print(x);
        }
        
    }


    /**
    * Calcula las notas de <b>codAdivinador</b> en función de <b>codPensador</b>. Asigna los
    buenos
    * y los regulares a los argumentos con el mismo nombre
    * @param codAdivinador El código del adivinador. Se asume que es un código correcto.
    * @param codPensador El código del pensador. Se asume que es un código correcto.
    * @param buenos El cálculo de buenos será asignado a este parámetro.
    * @param regulares El cálculo de regulares será asignado a este parámetro.
    */
    public static void calcularNota(char[] codAdivinador, String[] codPensador, AtomicInteger
    buenos, AtomicInteger regulares){

        for (int i = 0; i < LARGO_CODIGO; i++) {
            if (codPensador[i].equals(String.valueOf(codAdivinador[i]))) {
                buenos.set(buenos.get()+1);
                evaluadasP[i]= true;
                evaluadasA[i]= true;
            }
        }

        for (int i = 0; i < LARGO_CODIGO; i++) {
            for (int j = 0; j < LARGO_CODIGO; j++) {
                if (i!=j) {
                    if(evaluadasP[j] == false && evaluadasA[i]== false){
                        if (codPensador[i].equals(String.valueOf(codAdivinador[j]))) {
                            regulares.set(regulares.get()+1);
                            evaluadasP[j]= true;
                            evaluadasA[i]= true;

                        }

                    }

                }
            }
        }
        System.out.println("B= "+buenos+" R= "+regulares);
    }


}

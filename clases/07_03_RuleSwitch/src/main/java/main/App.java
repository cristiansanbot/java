
package main;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Programa ADVIVINADOR utilizando enumerados, registros y rule switch.
 * @author cristian
 */
public class App {
    
    /**
     * Cantidad maxima de intentos en dificicultad facil.
     */
    public static int MAX_INTENTOS_FACIL= 15;
    /**
     * Cantidad maxima de intentos en dificultad dificil.
     */
    public static int MAX_INTENTOS_DIFICIL= 10;
    /**
     * Numero maximo posible de eleccion. Se genera un numero entre
     * 1 y NUMERO_MAXIMO.
     */
    public static int NUMERO_MAXIMO= 100;
    
    /**
     * Las dificultades disponibles en el juego.
     */
    public static enum Dificultad{FACIL, DIFICIL};
    /**
     * Los estados en el juego. <br>
     * <ul>
     * <li><b>JUGANDO</b>: El juego ha iniciado no se ha ganado aun, ni perdido.</li>
     * <li><b>GANO</b>: El jugador adivino el numero secreto antes de agotar los intentos.</li>
     * <li><b>PERDIO</b>: El jugador agoto los intentos antes de adivinar el numero secreto.</li>
     * </ul>
     */
    public static enum Estado{JUGANDO, GANO, PERDIO};
    /**
     * Se utilizara para comparar el numero ingresado por el usuario
     * frente al numero secreto.
     */
    public static enum Resultado{ES_MAYOR, ES_IGUAL, ES_MENOR};
    
    /**
     * Modelo del juego: <br>
     * <ul><li><b>Dificultad</b>: Arreglo de una celda conteniendo la dificultad del juego.</li>
     * <li><b>maxIntentos</b>:  Cantidad maxima de intentos con que se inicio el juego segun su dicifultad.</li>
     * <li><b>Estado</b>: Arreglo de 1 celda conteniendo el estado actual del juego.</li>
     * <li><b>numeroSecreto</b>: El numero secreto generado aleatoriamente entre 1 y NUMERO_MAXIMO</li>
     * <li><b>intentoActual</b>: El intento actual del jugador.</li>
     * </ul>
     */
    public static record Juego(
        Dificultad[] dificultad,
        AtomicInteger maxIntentos,
        Estado[] estado,
        AtomicInteger numeroSecreto,
        AtomicInteger intentoActual
    ){};
    
    /**
     * Inicializa un juego con los valores correctosacorde a la dificultad asginada.
     * El estado inicial sera JUGANDO y el intento actual sera 0. Tambien se generara
     * un numero aleatorio entre 1 y NUMERO_MAXIMO.
     * @param d La dificultad con que se iniciara el juego.
     * @return Retorna un juego listo para comenzar.
     * @see Dificultad
     * @see Estado
     * @see Juego
     * @see NUMERO_MAXIMO
     * 
     */
    public static Juego iniciarJuego(Dificultad d){
        Juego j= new Juego(new Dificultad[1], new AtomicInteger(), new Estado[1], new AtomicInteger(), new AtomicInteger());
        j.dificultad[0]=d;
        if (d==Dificultad.FACIL) {
            j.maxIntentos.set(MAX_INTENTOS_FACIL);
        } else{
            j.maxIntentos.set(MAX_INTENTOS_DIFICIL);
        }
        
        j.estado[0]=Estado.JUGANDO;
        j.numeroSecreto.set(new Random().nextInt(NUMERO_MAXIMO)+1);
        return j;
    }
    
    
    /**
     * Se evalua si el intento actual es superior al numero maximo de intentos, en caso
     * positivo PERDIO. si n es igual al numero secreto, se retorna ES_IGUAL; si el numero
     * secreto es menor que n, retorna ES_MENOR, y si no, ES_MAYOR. Si el usuario adivino 
     * el numero secreto se cambia el estado del juego por GANO. El parametro mensaje 
     * obtendra un mensaje adecuado en funcion de lo que ocurra. 
     * @param n El numero ingresado por el usuario.
     * @param j El juego.
     * @param mensaje El mensaje se obtendra aqui.
     * @return ES_IGUAL, ES_MENOR, ES_MAYOR en funcion del numero secreto comparado con n.
     */
    public static Resultado verificarNumero(int n, Juego j, StringBuilder mensaje){
        j.intentoActual.set(j.intentoActual.get()+1);
        mensaje.delete(0, mensaje.length());
        Resultado resultado;

            if (n==j.numeroSecreto.get()) {
                j.estado[0] = Estado.GANO;
                mensaje.append("¡¡¡GANASTE!!!");
                resultado = Resultado.ES_IGUAL;
            } else if (j.numeroSecreto.get()<n) {
                mensaje.append("El numero a adivinar es menor.");
                resultado = Resultado.ES_MENOR;
            }else{
                mensaje.append("El numero a adivinar es mayor.");
                resultado = Resultado.ES_MAYOR;
            }
        if(j.intentoActual.get()==j.maxIntentos.get()&& resultado != Resultado.ES_IGUAL){
            mensaje.delete(0, mensaje.length());
            mensaje.append("¡¡¡PERDISTE!!! El numero era ").append(j.numeroSecreto).append(".");
            j.estado[0]= Estado.PERDIO;
        }

        
        return resultado;
    }
    
    
    /**
    * Logica del juego
    * @param args Argumentos de la linea de comandos. o se utiliza.
    */
    public static void main(String[] args) {
        String dif;
        Scanner consola = new Scanner(System.in);
        Juego juego;
        int numeroUsuario;
        Resultado resultado;
        StringBuilder mensaje = new StringBuilder();
        
        System.out.println("Elige una dificultad [F]FACIL / [D]DIFICIL >>");
        dif = consola.nextLine();
            
        while((dif.length()!=1)||((dif.charAt(0)!='F') && (dif.charAt(0)!='D'))){
            System.out.println("ERROR: Ingresa D o F >> ");
            dif=consola.nextLine();
        }
        
        juego = switch(dif){
            case "F" -> iniciarJuego(Dificultad.FACIL);
            case "D" -> iniciarJuego(Dificultad.DIFICIL);
            default -> iniciarJuego(Dificultad.FACIL);
        };
        
        System.out.println("\nDispones de "+juego.maxIntentos+" intentos para adivinar.\n");
        
        do{
            System.out.println("Intento "+(juego.intentoActual.get()+1)+" >> ");
            numeroUsuario= consola.nextInt(); consola.nextLine();
            resultado= verificarNumero(numeroUsuario, juego, mensaje);
            System.out.println(mensaje);
        }while(juego.estado[0]==Estado.JUGANDO);
        
        
    }
}

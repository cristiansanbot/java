package main;

import java.util.concurrent.atomic.AtomicInteger;

public class Project6 {

    public final static int MAX_INTENTOS = 10;
    public final static int LARGO_CODIGO = 4;
    public final static char PRIMERA_LETRA = 'A';
    public final static char ULTIMA_LETRA = 'H';

    /**
    * Representa a un código y las notas que éste ha recibido.
    */
    public static record TRegistroNota(
        char[] codigo,
        AtomicInteger b,
        AtomicInteger r
    ){
    
    }
    
    /**
    * Es un arreglo con tope
    */
    public static record THistoria(
        TRegistroNota[] info,
        AtomicInteger tope
    ){
        
        
    }


    /**
    * Genera un código al azar y lo asigna a la variable codigo. El codigo generado
    * puede contener letras repetidas.
    * @return Un código de LARGO_CODIGO caracteres generados aleatoriamente.
    */
    public static char[] generarCodigo(){
        
    }

    /**
    * Lee dos notas a la vez: B y R y retorna TRUE si son correctas o FALSE si no lo son.
    * En caso de que las notas no sean correctas B y R quedan con el valor 0.
    * El fin de linea es consumido.
    * Para verificar que las notas sean correctas se contempla lo siguiente:

    1: Son valores enteros
    2: Están entre 0 y LARGO_CODIGO
    3: La suma de B+R no puede ser mayor que LARGO_CODIGO
    4: Si B=(LARGO_CODIGO-1) y R>=1 las notas están mal.

    * Asigna a la variable errorMessage uno de estos dos mensajes según el caso:

    1 y 2: 'ERROR: Ingresa solo dos numeros enteros entre 0 y [LARGO_CODIGO] separados por un espacio en blanco.'
    3 y 4: 'ERROR: Las notas no son correctas, por favor verifica los valores.'
    * @param b
    * @param r
    * @param errorMessage
    * @return
    */
    public static boolean leerNotas(AtomicInteger b, AtomicInteger r, StringBuilder errorMessage){
        return true;
    }

    /*Imprime el codigo en la salida. Deja el cursor justo al final.*/
    public static void imprimirCodigo(char[] codigo){

    }

    /**
    * Genera el codigo siguiente al actual en forma circular y lo retorna. Por ejemplo:
    * <ul><li>AAAA --> AAAB</li>
    * <li>ABCH --> ABDA (En este caso H es la letra más grande admitida)</li>
    * <li>HHHH --> AAAA</li></ul>
    * @param codigo El código a partir del cual se generará el siguiente.
    * @return El código siguiente a partir de <b>codigo</b>
    */
    public static char[] siguienteCodigo(char[] codigo){

    }

    /**
    * Crea una historia vacía y la retorna como valor.
    * @return El objeto THistoria inicializado para hacer uso de ella en el juego.
    */
    public static THistoria crearHistoria(){

    }

    /**
    * Retorna TRUE si la historia está vacía, FALSE en caso contrario.
    * @param h La historia de la cual se desea saber si es vacía o no.
    * @return
    */
    public static boolean esHistoriaVacia(THistoria h){
        return true;
    }


    /**
    * Guarda en la historia un nuevo código con sus respectivas notas asociadas.
    * Los parámetros <b>buenos</b> y <b>regulares</b> no serán agregados a <b>h</b>,
    * sino que se guardarán copias de ellos.
    * @param h La historia en la cual se guardarán las notas.
    * @param codigo El código que se guardará en la historia.
    * @param buenos El valor de buenos a guardar.
    * @param regulares El valor de regulares a guardar.
    */
    public static void guardarNota(THistoria h, char[] codigo, AtomicInteger buenos, AtomicInteger regulares){
    
    }

    
    /**
    * Calcula las notas de <b>codAdivinador</b> en función de <b>codPensador</b>. Asigna los
    * buenos y los regulares a los argumentos con el mismo nombre.
    * @param codAdivinador El código del adivinador. Se asume que es un código correcto.
    * @param codPensador El código del pensador. Se asume que es un código correcto.
    * @param buenos El cálculo de buenos será asignado a este parámetro.
    * @param regulares El cálculo de regulares será asignado a este parámetro.
    */
    public static void calcularNota(char[] codAdivinador, char[] codPensador, AtomicInteger buenos, AtomicInteger regulares){
    
    }

    
    /**
    * Retorna TRUE si el código pasado como argumento es apropiado para postular al
    * pensador o FALSE si no lo es. Para ello se compara el código con todos los códigos
    * guardados en la historia evaluando sus notas. Si estas notas coinciden entonces
    * el código es adecuado, si un caso falla entonces ya no lo será.
    * @param c El código a ser evaluado como posibilidad de adivinación
    * @param h La historia que se tomará en cuenta para evaluar el código
    * @return TRUE si el código es adecuado, FALSE si no lo es.
    */
    public static boolean esAdecuado(char[] c, THistoria h){
        return true;
    }
    
    
    public static void main(String[] args) {
        
        
    }
}

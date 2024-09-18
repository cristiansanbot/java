/*
Escape Sequence              Description
        \t        Insert a tab in te text at this point.
        \b        Insert a backspace in the text at this point
        \n        Insert a newline in te text at this point.
        \r        Insert a carriage return in te text at this point.
        \f        Insert a form feed in te text at this point.
        \'        Insert a single quote cheracter in te text at this point.
        \"        Insert a double quote cheracter in te text at this point.
        \\        Insert a backslash character in te text at this point.
*/



package main;

public class EscapeChars {
    public static void main(String[] args){
        System.out.println("Hola, esta es la lista de \'compras\':\n"
                + "\t\"Harina\n"
                + "\tLeche\n"
                + "\tPan\n"
                + "\tArróz\n");
        System.out.println("Hola\nmundo");
        
        System.out.println("La ruta del archivo es C:\\Mis documentos\\Texto.txt");
    }
}

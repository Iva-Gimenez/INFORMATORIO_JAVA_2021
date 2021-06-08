/**
 * Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje
 *  “HOLA {USUARIO}!!!
 */


import java.util.Scanner;

public class Ejer1_Level1 {
    
    public static void main (String[] args){
        Scanner nombre = new Scanner(System.in);
        String nomb;
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.print("Ingrese su nombre: ");
        nomb = nombre.nextLine();
        System.out.println();
        System.out.println("HOLA " + nomb);
        System.out.println("-------------------------------------------------");
    }
}

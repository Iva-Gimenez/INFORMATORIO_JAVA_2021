/**
 * Realizar un programa que calcule el factorial de un número:
 *n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
 *Sin hacer uso de librerías.
 */

import java.util.Scanner;

public class Ejer4_Level1 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int iFactorial = 1;
        int nro;
        int i=1;

        System.out.println("-------------------------------------------------");
        System.out.print("Introduzca el valor de N: ");
        nro = scan.nextInt(); 
        System.out.println();

        do{ iFactorial= iFactorial *i ; i= i +1; 
        } while (i <= nro);

         System.out.println("El factorial de " + nro + " es: " + iFactorial);
         System.out.println();
         System.out.println("-------------------------------------------------");
    }
}

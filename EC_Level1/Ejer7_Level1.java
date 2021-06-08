/**
 * Realizar un Programa que dado un String de entrada en minúsculas lo convierta 
 * por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
 */

import  java.util.Scanner;

public class Ejer7_Level1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.print("Introduzca una oración: ");
        String cadena = scan.nextLine(); 
        scan.close();

        System.out.println();
        System.out.println(cadena.toUpperCase());
        System.out.println();
        System.out.println("-------------------------------------------------");
    }
}
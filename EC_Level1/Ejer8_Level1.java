/**
 * Crear una aplicación que solicite de entrada los datos de una persona en este orden:
 *  Nombre y Apellido
 *  Edad
 *  Dirección
 *  Ciudad
 *  Luego imprimirá el siguiente mensaje:
 *   {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */

import java.util.Scanner;

public class Ejer8_Level1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.print("Ingrese el Nombre y Apellido: ");
        String NyA = scan.nextLine(); 
        System.out.println();
        System.out.print("Ingrese la Edad: ");
        int edad = scan.nextInt(); 
        System.out.println();
        System.out.print("Ingrese la Dirección: ");
        scan.nextLine();
        String direc = scan.nextLine(); 
        System.out.println();
        System.out.print("Ingrese la Ciudad: ");
        String cdad = scan.nextLine(); 
        System.out.println();
        scan.close();

        System.out.println("-------------------------------------------------");
        System.out.println("Datos Ingresados:");
        System.out.println("");
        System.out.println(cdad + " - " + direc + " - " + edad + " - "+ NyA + " - ");
        System.out.println();
        System.out.println("-------------------------------------------------");
    }
}

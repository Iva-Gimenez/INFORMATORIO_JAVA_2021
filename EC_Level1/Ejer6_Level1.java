/**
 * Se desea una aplicación que solicite 2 
 * números enteros y realice la operación de potencia (sin uso de librerías).
 */

import java.util.Scanner;

public class Ejer6_Level1 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.print("Introduzca el Primer Número: ");
        int nro1 = scan.nextInt(); 
        System.out.println();
        System.out.print("Introduzca la Potencia: ");
        int nro2 = scan.nextInt(); 
        System.out.println();
        int resultado = nro1;

        for (int i = 1; i < nro2; i++) {
            resultado = resultado * nro1;
            scan.close();
        }

        System.out.print("El resultado de la potencia: " + nro1 + " ^ " + nro2 + " = " + resultado);
        System.out.println();
        System.out.println("-------------------------------------------------");
    }
}
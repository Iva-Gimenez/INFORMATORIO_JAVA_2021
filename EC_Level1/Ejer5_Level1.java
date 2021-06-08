/**
 * Se desea una aplicación que solicite 2 números enteros y 
 * realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
 */

 import java.util.Scanner;

public class Ejer5_Level1 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.print("Introduzca el Primer Número: ");
        int nro1 = scan.nextInt(); 
        System.out.print("Introduzca el Segundo Número: ");
        int nro2 = scan.nextInt(); 
        System.out.println();
        int resultado = 0;

        for (int i = 1; i <= nro2; i++) {
            resultado = resultado + nro1;
            scan.close();
        }

        System.out.print("El resultado de la suma sucesiva es: " + resultado);
        System.out.println();
        System.out.println("-------------------------------------------------");
    }
}

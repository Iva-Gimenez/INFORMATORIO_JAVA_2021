/**
 * Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el
 * resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.
 */

import java.util.Scanner;

public class Ejer2_Level1 {

    public static void main (String[] args){
        int num1; 
        int num2;
        float result;
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.print("Ingrese el primer número: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scan.nextInt();
        System.out.println();
        System.out.println("-------------------------------------------------");
        scan.close();

        result = num1+num2;
        System.out.println("La Suma es: " + num1 + " + " + num2 + " = " + result);
        System.out.println();
        System.out.println("-------------------------------------------------");

        result = num1-num2;
        System.out.println("La Resta es: " + num1 + " - " + num2 + " = " + result);
        System.out.println();
        System.out.println("-------------------------------------------------");

        result = num1*num2;
        System.out.println("La Multiplicación es: " + num1 + " * " + num2 + " = " + result);
        System.out.println();
        System.out.println("-------------------------------------------------");

        try{
            result = num1/num2;
            System.out.println("La División es: " + num1 + " / " + num2 + " = " + result);
            System.out.println();
            System.out.println("-------------------------------------------------");
        } catch (Exception e){
            System.out.println("No se pudo realizar esta operación!");
            System.out.println("-------------------------------------------------");
            }

        try{
            result = num1%num2;
            System.out.println("La División es: " + num1 + " % " + num2 + " = " + result);
            System.out.println();
            System.out.println("-------------------------------------------------"); 
        } catch (Exception e){
            System.out.println("No se pudo realizar esta operación!");
        }
    }
}

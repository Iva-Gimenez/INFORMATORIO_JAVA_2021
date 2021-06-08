/***
 * Confeccionar un programa que dado un número entero 
 * como dato de entrada imprima la secuencia de números (incrementos de 1)
 */


import java.util.Scanner;

public class Ejer3_Level1 {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);  
        
            System.out.println("-------------------------------------------------");
            System.out.print("Introduzca el valor de N: ");
                int num = scan.nextInt();
                for (int i = 0; i <= num+1 ; i ++){
                    for (int j = 1; j < i ; j++){
                        System.out.print(j);
                    }
                    System.out.println();
                    System.out.println("-------------------------------------------------");
                }
        scan.close();
    }
}

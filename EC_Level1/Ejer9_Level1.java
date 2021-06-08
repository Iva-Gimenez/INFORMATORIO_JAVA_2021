/**
 * Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
 */

 import java.util.Scanner;

public class Ejer9_Level1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String texto;
        String carac;
        int cantVeces = 0;
        System.out.println("-------------------------------------------------");
        System.out.print("Introduzca un texto: ");
        texto = scan.nextLine();
        System.out.println();
        System.out.print("Ingrese el caracter que desea contabilizar: ");
        carac = scan.nextLine();

        for (int i = 0; i < texto.length(); i++) {
         if(texto.charAt(i) == carac.charAt(0)){
            cantVeces ++;
            }
        }

        if (cantVeces != 0) {
            System.out.println("El caracter: "+ carac.charAt(0) + " se repite " + cantVeces + " veces");
            System.out.println();
            System.out.println("-------------------------------------------------");
        }else{
            System.out.println();
            System.out.println("El caracter: " + carac.charAt(0) + ", no se encuentra en este texto");
            System.out.println();
            System.out.println("-------------------------------------------------");
        }

        scan.close();
    }
    
}

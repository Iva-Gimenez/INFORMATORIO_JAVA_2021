package EC_Level2;

/**
 * Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero 
 * al principio de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista 
 * y el tamaño de la misma (antes y después de agregar a en la primera y última posición)
 */

 import java.util.ArrayList;

public class Ejer2_Level2 {

    public static void main(String[] args){
        System.out.println("------------------------------------------------");
       
        ArrayList<Integer> enteros = new ArrayList();
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        enteros.add(6);

        System.out.println("Lista Inicial: ");
        mostrar(enteros);
        System.out.println();
        System.out.println("El tamaño de la lista actual es de: " + enteros.size() + " elementos.");
        enteros.add(0, 1);
        enteros.add(7);
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Lista Final: ");
        mostrar(enteros);
        System.out.println();
        System.out.println("El tamaño de la lista final es de: " + enteros.size() + " elementos.");
        System.out.println("------------------------------------------------");
    }

    public static void mostrar(ArrayList<Integer> array){
        for (Integer lista :array) {
            System.out.println(lista);
        }
    }
    
}

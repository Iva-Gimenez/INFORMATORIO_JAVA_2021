package EC_Level2;

/**
 * Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), 
 * nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. 
 * Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” 
 * y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
 * Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor 
 * debe frenar (no se incluye en el cálculo)
 */

 import java.util.ArrayList; 

public class Ejerc7_Level2 {

    public static void main(String[] args){
        fizzBuzzFuncion(1,8);
        System.out.println("------------------------------------------------");
    }
    
    public static void fizzBuzzFuncion(int inicio, int fin){
        ArrayList<String> lista = new ArrayList();

        for (int i = inicio; i < fin; i++ ){
            
            if(i % 2 == 0 && i % 3 == 0){
                lista.add("FizzBuzz");
            } else if (i % 2 == 0){
                lista.add("Fizz");
            }  else if (i % 3 == 0){
                lista.add("Buzz");
            } else{
                lista.add(String.valueOf(i));
            }
        }
    
        System.out.println(lista);
        System.out.println("------------------------------------------------");
    }
}

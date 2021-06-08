package EC_Level2;

/**
 * Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa 
 * (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden 
 * inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 */

import java.util.ArrayList;
import  java.util.Collections;

public class Ejerc3_Level2 {
    
    public  static  void  main ( String[] args ){
        ArrayList<String> cartas = new ArrayList<>();
        for (int i = 0; i < 13; i++){
            cartas.add("Carta " + (i + 1));
        }

        System.out.println("------------------------------------------------");
        System.out.println("Orden Normal de las cartas: ");
        for (String carta : cartas){
            System.out.println(carta);
        }

        Collections.reverse(cartas);
        System.out.println("------------------------------------------------");
        System.out.println("Orden Inverso de las cartas: ");
        System.out.println();
        System.out.println(cartas);

        Collections.shuffle(cartas);
        System.out.println("------------------------------------------------");
        System.out.println("Orden Aleatorio de las cartas: ");
        System.out.println();
        System.out.println(cartas);
        System.out.println();
        System.out.println("------------------------------------------------");
    }

}

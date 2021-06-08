package EC_Level2;

import java.util.ArrayList;

public class Ejer1_Level2 {

    public static void main(String[] args){
        System.out.println("------------------------------------------------");
       
        ArrayList<String> ciudades = new ArrayList();
        ciudades.add("Bariloche.");
        ciudades.add("Córdoba.");
        ciudades.add("Resistencia.");

        for (int i = 0; (i < ciudades.size()); i++) {
            System.out.println(" # " + (i + 1) + " - " + ciudades.get(i));
        }

        System.out.println("------------------------------------------------");
    }
    
}

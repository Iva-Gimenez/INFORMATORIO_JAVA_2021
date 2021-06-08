package EC_Level2;

/**
 * Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen
 *  de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y 
 * luego imprimir el total final a cobrar.
 */

 import java.util.Scanner;
 import java.util.ArrayList;

public class Ejerc5_Level2 {
    
    public static void main ( String [] args ) {

        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> horas =  new  ArrayList <> ();
        ArrayList <Integer> sueldo =  new  ArrayList <> ();
        ArrayList <Integer> total_semana =  new  ArrayList <> ();
        ArrayList <Integer> total_mes =  new  ArrayList <> ();
        String[] dias_semana = new String[] {" Lunes " , " Martes " , " Miercoles " , " Jueves " , " Viernes " };

        for (String i : dias_semana) {
            System.out.println("------------------------------------------------");
            System.out.println();
            System.out.println( "Ingrese la Cantidad de Horas Trabajadas: "+ i );
            horas.add(scan.nextInt());
            System.out.println();
            System.out.println(" Ingrese el precio por hora trabajada: ");
            sueldo.add(scan.nextInt());
        }

        int total =  0 ;
        for(int i = 0; i < horas.size(); i++){
            int x = horas.get(i) * sueldo.get(i);
            total_semana.add(x);
            total += x;
        }
        total_mes.add(total);

        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println("Salario por Semana: " + total_semana);
        System.out.printf("Total final por Semana: $" + total_mes.get(0));
        System.out.println();
        System.out.println("------------------------------------------------");
        scan.close();
    } 
}
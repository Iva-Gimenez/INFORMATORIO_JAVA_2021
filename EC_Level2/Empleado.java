package EC_Level2;

/**
 * Se dispone de una lista de Empleados, de cada empleado se conoce:
 * Nombre y Apellido
 * DNI
 * horasTrabajadas
 * valorPorHora
 * Todos los empleados están cargados en un Set (HashSet), se desea calcular el 
 * sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario)
 *  donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Empleado {
    
    private String name;
    private String lastName;
    private int dni;
    public int horas;
    public int valorXhoras;

    public Empleado(String name, String lastName, int dni, int horas, int valorXhoras) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.horas = horas;
        this.valorXhoras = valorXhoras;
    }

    public int getDni() {
        return dni;
    }

    public int getHoras() {
        return horas;
    }

    public int getValorXhoras() {
        return valorXhoras;
    }

	public String toString() {
 		return "Nombre y apellido: " + name +" "+ lastName;
    }
    
    public static int sueldo(int hs, int salario){

        int sueldo = hs * salario;
        return sueldo;
    }

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        HashMap<Integer, Object> empleados = new HashMap<>();
        HashSet<Object> listaEmpleados = new HashSet<>();

        while(true){
            System.out.println();
            System.out.println("----------------------------------------");
            System.out.print("Ingrese el nombre del empleado: ");
            String name = ingreso.nextLine();
            System.out.println();
            System.out.print("Ingrese el Apellido: ");
            String lastName = ingreso.nextLine();
            System.out.println();
            System.out.print("Ingrese el DNI: ");
            int dni = ingreso.nextInt();
            System.out.println();
            System.out.print("Ingrese las horas trabajadas: ");
            int horas = ingreso.nextInt();
            System.out.println();
            System.out.print("Ingrese pago por hora: ");
            int valorXhoras = ingreso.nextInt();
            System.out.println();
            System.out.println("----------------------------------------");

            Empleado empleado = new Empleado(name, lastName, dni, horas, valorXhoras);

            listaEmpleados.add(empleado);

            System.out.println("¿Desea agregar otro empleado?");
            System.out.println("1 - Sí");
            System.out.println("2 - Salir");
            int in = ingreso.nextInt();
            ingreso.nextLine();
            if(in == 2){
                break;
            }else{
                continue;
            }
        }

        for(Object i : listaEmpleados){
            
            int sueldo = sueldo(((Empleado) i).getHoras(), ((Empleado) i).getValorXhoras());
            empleados.put(((Empleado) i).getDni(), sueldo);
        }

        
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println(listaEmpleados);
        System.out.println();
        System.out.println("----------------------------------------");

        ingreso.close();
    }
}

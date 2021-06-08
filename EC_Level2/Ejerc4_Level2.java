package EC_Level2;

/**
 * Cargar un arrayList con 12 nombres de estudiantes (String),
 *  luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
 */

 import java.util.ArrayList;
 import java.util.List;

public class Ejerc4_Level2 {
    public  static  void  main ( String[] args ){
        ArrayList<String> estudiantes = new ArrayList<>();
        estudiantes.add("López Noelia");
        estudiantes.add("Gimenez Luis");
        estudiantes.add("Meza Marcelina");
        estudiantes.add("Maciel Antonia");
        estudiantes.add("Pérez Alberto");
        estudiantes.add("Gigena German");
        estudiantes.add("Acosta César");
        estudiantes.add("Araoz Silvana");
        estudiantes.add("Benitez Natalia");
        estudiantes.add("Correa Alejandro");
        estudiantes.add("Vera Miguel");
        estudiantes.add("Cardozo, Mariana");

        List<String> PrimerCurso = estudiantes.subList(0,4);
        List<String> SegundoCurso = estudiantes.subList(4,8);
        List<String> TercerCurso = estudiantes.subList(8,estudiantes.size());

        System.out.println("------------------------------------------------");
        System.out.println("Primer Curso: ");
        System.out.println("------------------------------------------------");
        for (String estudiante : PrimerCurso){
            System.out.println(estudiante);
            System.out.println();
        }

        System.out.println("------------------------------------------------");
        System.out.println("Segundo Curso: ");
        System.out.println("------------------------------------------------");
        for (String estudiante : SegundoCurso){
            System.out.println(estudiante);
            System.out.println();
        }

        System.out.println("------------------------------------------------");
        System.out.println("Tercer Curso: ");
        System.out.println("------------------------------------------------");
        for (String estudiante : TercerCurso){
            System.out.println(estudiante);
            System.out.println();
        }
        System.out.println("------------------------------------------------");
    }

}

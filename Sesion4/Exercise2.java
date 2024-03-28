import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    public static void showExercise2() {
        // Your code here!
        ArrayList<String> cadenas = new ArrayList<String>();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese un elemento");
        String elemento = Sc.next();
        cadenas.add(elemento);
        for (int i1 = 1; cadenas.size() != 0 && i1 > 0; i1 = i1 + 1) {
            System.out.println("Si desea agregar(1) o eliminar (0) o ver lista (2) o salir (5)");
            int respU = Sc.nextInt();
            if (respU == 1) {
                System.out.println("Ingrese el elemento que desea añadir");
                elemento = Sc.next();
                cadenas.add(elemento);
            } else if (respU == 0) {
                System.out.println("Indique el índice del elemento a eliminar");
                int eliminar = Sc.nextInt();
                cadenas.remove(eliminar);
            } else if (respU == 2) {
                for (String listaElementos : cadenas ){
                System.out.println(listaElementos);
            }
            } else if (respU == 5) {
                i1 = i1 * (-1);
            }
        }
    }
}
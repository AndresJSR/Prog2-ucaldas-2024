import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de n");
        int n = Sc.nextInt();
        int limite = n;
        for (int f = 0; f < limite; f++) {
            int valor = 1;
            int k = 0;
            while (k <= f) {
                System.out.print(" ");
                k++;
            }
            while (valor <= n) {
                System.out.print(valor + " ");
                valor++;
            }
            System.out.println(" ");
            n--;
        }
    }
}

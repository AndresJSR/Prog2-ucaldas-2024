import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
      int numRandom = (int) ((Math.random() * 100) + 1);
      System.out.println("El numero aleatorio es " + numRandom);
      System.out.println("Elija un número del 1 al 100");
      int respUsuario = Sc.nextInt();
      while (respUsuario != numRandom) {
         if (respUsuario < numRandom) {
            System.out.println("El número por adivinar es mayor");
         } else if (respUsuario > numRandom) {
            System.out.println("El número por adivinar es menor");
         }
         System.out.println("Ingrese otro número");
         respUsuario = Sc.nextInt();
         if (respUsuario == numRandom) {
            System.out.println("¡Has adivinado el número!");
         }
      }
   }
}
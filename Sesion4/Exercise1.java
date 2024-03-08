
public class Exercise1 {
    public void showExercise1() {
        int[] array_enteros = { 1, 2, 3, 4, 5 };
        int suma = 0;
        for (int x = 0; x < array_enteros.length; x++) {
            suma = suma + array_enteros[x];
            System.out.println(suma);
        }
    }
}

/*Desarrolla un programa que permita al usuario gestionar una lista de contactos utilizando un ArrayList. Cada contacto estará representado por un objeto que
contendrá un nombre, un número de teléfono y una dirección de correo electrónico. El programa debería mostrar un menú al usuario con opciones para
agregar un nuevo contacto, eliminar un contacto existente, buscar un contacto por nombre y mostrar todos los contactos presentes en la lista. Además, el
programa debería permitir al usuario actualizar la información de un contacto específico, como su número de teléfono o dirección de correo electrónico.
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise4 {
    Scanner sc = new Scanner(System.in);
    //Atributos 
    String nombre;
    String email;
    int telefono;
    public void mostrar(){
        System.out.println("El nombre del contato es "+ nombre);
        System.out.println("El numero del contacto es "+ telefono);
        System.out.println("El email del contadto es "+ email);
    }
}

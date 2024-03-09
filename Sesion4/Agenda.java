import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
        public ArrayList<Exercise4> listaContactos = new ArrayList<Exercise4>();
        Scanner sc = new Scanner(System.in);

        public void inPutData() {

                System.out.println("Ingrese el nombre del contacto");
                String user_name = sc.nextLine();
                System.out.println("celular");
                String cellphone = sc.nextLine();
                System.out.println("correo");
                String email = sc.nextLine();

                listaContactos.add(new Exercise4(user_name, cellphone, email));
                System.out.println("Datos ingresados correctamente");
                System.out.println(listaContactos);
        }
        // USAR FOR PARA RECOPILAR DATOS
}

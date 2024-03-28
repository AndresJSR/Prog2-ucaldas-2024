import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RegistroEstudiantes {
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public static void main(String[] args) {

        leer_archivo(estudiantes);
        for (Estudiante est : estudiantes) {
            System.out.println(" ( Nombre : " + est.getNombre() + " )" + " ( Código : " + est.getCodigo() + " )"
                    + " ( Carrera : " + est.getCarrera() + " )" + " ( Promedio : " + est.getPromedio() + " )");
        }
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nRegistro de Estudiantes");
            System.out.println("[1] Agregar Estudiante");
            System.out.println("[2] Eliminar Estudiante");
            System.out.println("[3] Listar Estudiantes");
            System.out.println("[4] Buscar Estudiante");
            System.out.println("[5] Salir\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ingresarEstudiante();
                    break;
                case 2:
                    mostrarLista();
                    eliminarEstudiante();
                    break;
                case 3:
                    mostrarLista();
                    break;
                case 4:
                    mostrarLista();
                    buscarEstudiante();
            }
        } while (opcion != 5);
    }

    public static void ingresarEstudiante() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el codigo");
        String codigo = sc.nextLine();
        System.out.println("Ingrese la carrera");
        String carrera = sc.nextLine();
        System.out.println("Ingrese el promedio Ej:1.1");
        double promedio = sc.nextDouble();
        estudiantes.add(new Estudiante(nombre, codigo, carrera, promedio));
    }

    public static void mostrarLista() {
        if (!estudiantes.isEmpty()) {
            System.out.println("Estudiantes de la lista");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println(i + " ( Nombre : " + estudiantes.get(i).nombre + " )" + " ( Código : "
                        + estudiantes.get(i).codigo + " )" + " ( Carrera : " + estudiantes.get(i).carrera + " )"
                        + " ( Promedio : " + estudiantes.get(i).promedio + " )");
            }
        } else {
            System.out.println("No existen estudiantes en la lista");
        }
    }

    public static void eliminarEstudiante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el código del estudiante por eliminar");
        String codigoEstEliminar = sc.next();
        if (!codigoEstEliminar.equals(null)) {
            for (int i = 0; i < estudiantes.size(); i++) {
                if (estudiantes.get(i).codigo.equals(codigoEstEliminar)) {
                    estudiantes.remove(i);
                }
            }
            System.out.println("Se ha eliminado al estudiante");

        } else {
            System.out.println("No existen estudiantes en la lista");
        }
    }

    public static void buscarEstudiante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] Nombre");
        System.out.println("[2] Código");
        System.out.println("[3] Carrera");
        System.out.println("[4] Salir");
        int resp = sc.nextInt();

        if (resp == 1) {
            System.out.println("Ingrese el nombre del estudiante");
            String nombreBuscar = sc.next();
            if (!nombreBuscar.equals(null)) {
                for (int i = 0; i < estudiantes.size(); i++) {
                    if (estudiantes.get(i).nombre.equals(nombreBuscar)) {
                        System.out.println(" ( Nombre : " + estudiantes.get(i).nombre + " )" + " ( Código : "
                                + estudiantes.get(i).codigo + " )" + " ( Carrera : " + estudiantes.get(i).carrera + " )"
                                + " ( Promedio : " + estudiantes.get(i).promedio + " )");
                    }
                }
            } else {
                System.out.println("No existen estudiantes en la lista");
            }

        } else if (resp == 2) {
            System.out.println("Ingrese el codigo del estudiante");
            String codigoBuscar = sc.next();

            if (!codigoBuscar.equals(null)) {
                for (int i = 0; i < estudiantes.size(); i++) {
                    if (estudiantes.get(i).codigo.equals(codigoBuscar)) {
                        System.out.println(" ( Nombre : " + estudiantes.get(i).nombre + " )" + " ( Código : "
                                + estudiantes.get(i).codigo + " )" + " ( Carrera : " + estudiantes.get(i).carrera + " )"
                                + " ( Promedio : " + estudiantes.get(i).promedio + " )");
                    }
                }
            } else {
                System.out.println("No existen estudiantes en la lista");
            }
        } else if (resp == 3) {
            System.out.println("Ingrese la carrera del estudiante");
            String carreraBuscar = sc.next();
            if (!carreraBuscar.equals(null)) {
                for (int i = 0; i < estudiantes.size(); i++) {
                    if (estudiantes.get(i).carrera.equals(carreraBuscar)) {
                        System.out.println(" ( Nombre : " + estudiantes.get(i).nombre + " )" + " ( Código : "
                                + estudiantes.get(i).codigo + " )" + " ( Carrera : " + estudiantes.get(i).carrera + " )"
                                + " ( Promedio : " + estudiantes.get(i).promedio + " )");
                    }
                }
            } else {
                System.out.println("No existen estudiantes en la lista");
            }
        }

    }

    private static void leer_archivo(ArrayList<Estudiante> lista) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(
                    "Lista_estudiantes.txt"));

            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 4) {

                    String nombre = bloques[0];
                    String codigo = bloques[1];
                    String carrera = bloques[2];
                    double promedio = Double.parseDouble(bloques[3]);
                    lista.add(new Estudiante(nombre, codigo, carrera, promedio));
                }
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }
}
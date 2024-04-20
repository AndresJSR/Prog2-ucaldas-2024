import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Seminars{
    
    static ArrayList <CourseInformation> courses_prog = new ArrayList<>();
    static ArrayList <CourseInformation> courses_fis = new ArrayList<>();
    static ArrayList <CourseInformation> courses_mat = new ArrayList<>();
    static Scanner sc = new Scanner (System.in);


    public static void leerArchivoTxtProg() {
        try (BufferedReader reader = new BufferedReader(new FileReader("prog.txt"))) {
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 5) {
                    String name = bloques[0];
                    String hours = bloques[1];
                    String name_professor = bloques[2];
                    String telephone = bloques[3];
                    String correo = bloques[4];
                    Professor professor = new Professor(name_professor, telephone, correo);
                    courses_prog.add(new CourseInformation(name, hours, professor));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void leerArchivoTxtFis() {
        try (BufferedReader reader = new BufferedReader(new FileReader("physics.txt"))) {
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 5) {
                    String name = bloques[0];
                    String hours = bloques[1];
                    String name_professor = bloques[2];
                    String telephone = bloques[3];
                    String correo = bloques[4];
                    Professor professor = new Professor(name_professor, telephone, correo);
                    courses_fis.add(new CourseInformation(name, hours, professor));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void leerArchivoTxtMat() {
        try (BufferedReader reader = new BufferedReader(new FileReader("math.txt"))) {
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 5) {
                    String name = bloques[0];
                    String hours = bloques[1];
                    String name_professor = bloques[2];
                    String telephone = bloques[3];
                    String correo = bloques[4];
                    Professor professor = new Professor(name_professor, telephone, correo);
                    courses_mat.add(new CourseInformation(name, hours, professor));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void watchSeminarProg(){
        for (CourseInformation courseInformation : courses_prog) {
            System.out.println(courseInformation);
        }
    }

    public void watchSeminarFis(){
        for (CourseInformation courseInformation : courses_fis) {
            System.out.println(courseInformation);
        }
    }

    public void watchSeminarMat(){

        for (CourseInformation courseInformation : courses_mat) {
            System.out.println(courseInformation);
        }
    }
    
    public CourseInformation course_info(){
        String name="";
        String opcion = "";
        CourseInformation courseInformation= null;
        System.out.println("Programación");
        System.out.println("Fisica");
        System.out.println("Matematicas");
        System.out.print("Ingrese el nombre de la categoria del seminario que desea ingresar: ");
        opcion = sc.nextLine();

        switch (opcion) {
            case "Programacion":
                System.out.print("Ingrese nombre de la materia: ");
                name = sc.nextLine();
                for (CourseInformation d : courses_prog) {
                    if(name.equals(d.getCourse_name())){
                        return d;
                    }
                }
                if(courseInformation==null){
                    System.out.println("No se encontro un seminario con ese nombre");
                    return null;
                }
            
            case "Fisica":
                System.out.println("Ingrese nombre de la materia: ");
                name = sc.nextLine();
                for (CourseInformation d : courses_fis) {
                    if(name.equals(d.getCourse_name())){
                        return d;
                    }
                }
                if(courseInformation==null){
                    System.out.println("No se encontro un seminario con ese nombre");
                    return null;
                }
            case "Matematicas":
                System.out.println("Ingrese nombre de la materia: ");
                name = sc.nextLine();
                for (CourseInformation d : courses_mat) {
                    if(name.equals(d.getCourse_name())){
                        return d;
                    }
                }
                if(courseInformation==null){
                    System.out.println("No se encontro un seminario con ese nombre");
                    return null;
                }

            default:
                System.out.println("Opcion incorrecta");
                break;
        }

        return null;
    }
}
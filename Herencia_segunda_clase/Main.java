import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
    static Student instance_student = new Student(null, null, null, null, 0);
    public static void main(String[] args) {
        
        
        instance_student.leerArchivosTxt();
        instance_student.Menu();
    }
    public void menu(){
    int opcion=0;
    do{
        System.out.println("1 listar materias totales o inscribir materias");
        System.out.println("2 listar  materias inscritas");
        System.out.println("3 salir");
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                instance_student.IsEligibleToEnroll();
                break;
        
            case 2:
                instance_student.GetSeminarsTaken();
                break;
            
            case 3:
                break;

            default:
                System.out.println("Opción Incorrecta");
                break;
        }

    }while(opcion!=3);
}
}
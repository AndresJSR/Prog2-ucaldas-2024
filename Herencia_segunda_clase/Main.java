import java.util.Scanner;
public class Main{
    static Scanner sc = new Scanner(System.in);
    static Student instance_student = new Student(null, null, null, null, 0);
    public static void main(String[] args) {
        
        
        instance_student.leerArchivosTxt();
        instance_student.IsEligibleToEnroll();
    }
    
}
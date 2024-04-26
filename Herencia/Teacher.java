import java.util.ArrayList;
import java.util.Scanner;
public class Teacher extends Person {
    String teacher_id = "";
    ArrayList<Subject> subject_taught = new ArrayList<>();
    ArrayList<String> Classrooms = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    
    public Teacher(String user_name, String lastname, String document, String gender, String teacher_id, ArrayList<Subject> subject_taught ,ArrayList<String> Classrooms) {
        super(user_name, lastname, document, gender);
        this.teacher_id=teacher_id;
        this.Classrooms=Classrooms;
        this.subject_taught=subject_taught;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public ArrayList<Subject> getSubject_taught() {
        return subject_taught;
    }

    public void setSubject_taught(ArrayList<Subject> subject_taught) {
        this.subject_taught = subject_taught;
    }

    public ArrayList<String> getClassrooms() {
        return Classrooms;
    }

    public void setClassrooms(ArrayList<String> classrooms) {
        Classrooms = classrooms;
    }
    public void add_assignement (){
        System.out.println("Ingrese cuantas materias va a agregar");
        
        subject_taught.add(new Subject(gender, document));
    }
}

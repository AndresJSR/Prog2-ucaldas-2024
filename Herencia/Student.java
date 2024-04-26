public class Student extends Person {
    private String student_id = "";

    public Student(String user_name, String lastname, String document, String gender, String student_id) {
        super(user_name, lastname, document, gender);
        this.student_id = student_id;
        // Super indica que viene de la superclase (la clase padre que viene después de
        // la palabra extends), en este caso es la calse padre Person
    }

    @Override
    public String toString() {
        return super.toString() + "Student_ID:" + this.student_id;
    }
}

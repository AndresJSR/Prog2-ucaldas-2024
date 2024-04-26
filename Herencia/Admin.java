public class Admin extends Person {
    String admin_id = "";
    String department = "";
    public Admin(String user_name, String lastname, String document, String gender, String admin_id, String department ) {
        super(user_name, lastname, document, gender);
        this.admin_id=admin_id;
        this.department=department;
    } 
    @Override
    public String toString() {
        return super.toString();
    }
}

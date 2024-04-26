public class Subject {
    String subject ="";
    String subject_hours="";
    
    public Subject(String subject, String subject_hours) {
        this.subject = subject;
        this.subject_hours = subject_hours;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject_hours() {
        return subject_hours;
    }
    public void setSubject_hours(String subject_hours) {
        this.subject_hours = subject_hours;
    }
    @Override
    public String toString() {
        return "Subject [subject=" + subject + ", subject_hours=" + subject_hours + "]";
    }
    
}

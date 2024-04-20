public class CourseInformation {
    public String course_name;
    public String week_hours;
    public Professor professor;

    public CourseInformation(String course_name, String week_hours, Professor professor) {
        this.course_name = course_name;
        this.week_hours = week_hours;
        this.professor = professor;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getWeek_hours() {
        return week_hours;
    }

    public void setWeek_hours(String week_hours) {
        this.week_hours = week_hours;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "CourseInformation [course_name=" + course_name + ", week_hours=" + week_hours + ", professor="
                + professor + "]";
    }

}

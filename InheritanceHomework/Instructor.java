package JavaKamp.odev3;

public class Instructor extends User{

    private String courses;

    public Instructor(String id, String firstName, String lastName, String mail) {
        super(id, firstName, lastName, mail);
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}

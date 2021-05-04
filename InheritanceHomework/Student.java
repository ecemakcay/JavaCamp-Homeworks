package JavaKamp.odev3;

public class Student extends User{
    private String school;
    private String alinanKurslar;

    public Student(String id, String firstName, String lastName, String mail, String school, String alinanKurslar) {
        super(id, firstName, lastName, mail);
        this.school = school;
        this.alinanKurslar = alinanKurslar;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAlinanKurslar() {
        return alinanKurslar;
    }

    public void setAlinanKurslar(String alinanKurslar) {
        this.alinanKurslar = alinanKurslar;
    }
}

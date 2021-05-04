package JavaKamp.odev3;

public class StudentManager extends UserManager {

    public void getCourse(Student student, String course){
        student.setAlinanKurslar(course);
        System.out.println(student.getAlinanKurslar()+" kursuna kayıt başarılı");
    }

}

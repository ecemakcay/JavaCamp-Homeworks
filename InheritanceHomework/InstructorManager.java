package JavaKamp.odev3;

public class InstructorManager extends UserManager{

    public void addCourse(Instructor instructor,String course){

        instructor.setCourses(course);
        System.out.println(course + " kursu sisteme eklenmiştir.");
    }
    public void addHomework(Instructor instructor, String homework){

        System.out.println(instructor.getCourses() + " kursuna" +
               homework +" ödevi eklenmiştir");
    }

}

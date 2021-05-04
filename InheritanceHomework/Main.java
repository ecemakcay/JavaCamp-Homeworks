package JavaKamp.odev3;

public class Main {

    public static void main(String[] args) {

       Student ecem = new Student("112346","Ecem","Akçay",
               "ecemakcay00@gmail.com","SDU","Java");

       StudentManager studentManager = new StudentManager();
       studentManager.add(ecem);
       studentManager.getCourse(ecem,"Java");


       Instructor engin = new Instructor("45465","Engin",
               "Demiroğ","engindemirog@hotmail.com");

       InstructorManager instructorManager= new InstructorManager();
       instructorManager.add(engin);
       instructorManager.addCourse(engin,"Java");
       instructorManager.addHomework(engin,"Ödev1");

       User[] users = {ecem,engin};

       UserManager userManager = new UserManager();
       userManager.addMultiple(users);

    }

}

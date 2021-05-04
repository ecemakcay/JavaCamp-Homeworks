package JavaKamp.odev3;

public class UserManager {

    public void add(User user){

        System.out.println(user.getFirstName() + " " +
                user.getLastName() + " " +
                "Kayıt Başarılı.");
    }

    public void addMultiple(User[] users){

        for (User temp : users)
           add(temp);
    }

}

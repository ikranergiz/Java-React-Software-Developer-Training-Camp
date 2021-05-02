package Homework3;

public class UserManager {
    private User user; //usermanager oluştuğunda bana kesin bir User nesnesi gelecek.Ben de bunu düzenleyeceğim.

    public UserManager(){
        System.out.println("UserManager default constructor");
    }
    public UserManager(User user){
        System.out.println("UserManager tek parametreli constructor");
        this.user = user;
    }
    public void add(){
        System.out.println(this.user.getFirstName() + " kullanıcı eklendi");
    }

    public void changeFirstName(String firstName){
        System.out.println("önceki isim: " + user.getFirstName());
        this.user.setFirstName(firstName);
        System.out.println("sonraki  isim: " + user.getFirstName());

    }
    public void print(){
        System.out.println("firstName: " + user.getFirstName()
                            + "\nlast name: " + user.getLastName()
                            + "\nid: " + user.getId());
    }

}

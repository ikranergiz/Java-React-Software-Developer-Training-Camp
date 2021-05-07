public class User {
    private String firstName;
    private String lastName;
    private int id;

    public User(){
        this.setFirstName("-");
        this.setLastName("-");
        this.setId(0);
    }

    public User(String firstName,String lastName,int id){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setId(id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

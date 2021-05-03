package interfaceAbstractDemo;

public class Customer implements IEntity {
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String nationaltyId;

    public Customer(){
        setId(1);
        setFirstName("Ahmet");
        setLastName("yılmaz");
        setDateOfBirth("1 ocak");
        setNationaltyid("12345679");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationaltyid() {
        return nationaltyId;
    }

    public void setNationaltyid(String nationaltyid) {
        this.nationaltyId = nationaltyid;
    }
}

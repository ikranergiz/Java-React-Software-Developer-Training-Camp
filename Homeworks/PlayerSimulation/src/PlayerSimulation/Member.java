package PlayerSimulation;

public abstract class Member {
    private String firstName;
    private String lastName;
    private String nationalIdentity;
    private int yearOfBirth;

    public Member(String firstName,String lastName,String nationalIdentity,int yearOfBirth){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNationalIdentity(nationalIdentity);
        this.setYearOfBirth(yearOfBirth);
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

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}

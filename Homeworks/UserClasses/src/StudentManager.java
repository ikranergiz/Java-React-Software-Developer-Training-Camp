public class StudentManager extends UserManager{
    public void add(Student student){
        System.out.println("added new Student : " + student.getFirstName() + " " + student.getLastName());
    }
}

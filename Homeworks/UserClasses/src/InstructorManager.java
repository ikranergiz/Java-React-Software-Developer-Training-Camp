public class InstructorManager extends UserManager{
    public void add(Instructor instructor){
        System.out.println("added new Instructor : " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}

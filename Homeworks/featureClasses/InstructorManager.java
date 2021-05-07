package featureClasses;

public class InstructorManager {
    public void addInstructor(Instructor instructor){
        System.out.println("added new instructor : " + instructor.firstName + " " + instructor.lastName);
    }
    public void deleteInstructor(Instructor instructor){
        System.out.println("deleted this instructor : " + instructor.firstName + " " + instructor.lastName);
    }

}

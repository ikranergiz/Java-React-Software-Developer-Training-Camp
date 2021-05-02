package Homework3;

public class InstructorManager extends UserManager{
    //base class da default constructor yazmadığımda hata oluyor?
    public InstructorManager(){
        System.out.println("InstructorManager default constructor");
    }
    @Override
    public void add(){
        System.out.println("Instructor eklendi");
    }
}

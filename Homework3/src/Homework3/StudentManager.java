package Homework3;

public class StudentManager extends UserManager{

    private Student student;

    public StudentManager() {
        super();
        student.setOran(0);
    }
    @Override
    public void add(){
        System.out.println("Student eklendi");
    }
    @Override
    public void print(){
        super.print();
        System.out.println("oran: " + student.getOran());
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

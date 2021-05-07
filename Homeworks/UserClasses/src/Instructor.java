public class Instructor extends User{
    private String courseName;

    public Instructor(){
        super();
        this.setCourseName("-");
    }

    public Instructor(String firstName,String lastName,int id,String courseName){
        super(firstName,lastName,id);
        this.setCourseName(courseName);
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

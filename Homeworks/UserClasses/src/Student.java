public class Student extends User{
    private int percentOfComplete;
    private String school;

    public Student(){
        super();
        this.setPercentOfComplete(0);
        this.setSchool("-");
    }
    public Student(String firstName,String lastName,int id,String school,int percentOfComplete){
        super(firstName,lastName,id);
        this.setSchool(school);
        this.setPercentOfComplete(percentOfComplete);
    }

    public int getPercentOfComplete() {
        return percentOfComplete;
    }

    public void setPercentOfComplete(int percentOfComplete) {
        this.percentOfComplete = percentOfComplete;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}

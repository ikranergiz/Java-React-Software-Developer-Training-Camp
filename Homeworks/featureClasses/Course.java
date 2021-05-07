package featureClasses;

public class Course {
    String name;
    int percentOfComplete;

    public Course(){
        this.name = "Java-React Course";
        this.percentOfComplete = 0;
    }

    public Course(String name, int percentOfComplete){
        this.name = name;
        this.percentOfComplete = percentOfComplete;
    }
}

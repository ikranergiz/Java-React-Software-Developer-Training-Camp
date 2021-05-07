package featureClasses;

public class CourseManager {
    public void addCourse(Course course){
        System.out.println("added new course : " + course.name);
    }
    public void deleteCourse(Course course){
        System.out.println("deleted this course : " + course.name);
    }

}

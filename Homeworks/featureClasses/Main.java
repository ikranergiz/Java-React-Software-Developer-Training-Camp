package featureClasses;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course();
        Course course2 = new Course("C# Angular Course",20);
        Course[] courses = new Course[]{course1,course2};

        CourseManager courseManager = new CourseManager();

        for(Course course : courses){
            courseManager.addCourse(course);
        }

        System.out.println("------------------------------------------------------------\n");

        Instructor instructor1 = new Instructor();
        Instructor instructor2 = new Instructor("Ahmet","Yılmaz");
        Instructor[] instructors = new Instructor[]{instructor1,instructor2};

        InstructorManager instructorManager = new InstructorManager();

        for(Instructor instructor : instructors){
            instructorManager.addInstructor(instructor);
        }

        System.out.println("------------------------------------------------------------\n");

        for(Course course : courses){
            courseManager.deleteCourse(course);
        }

        System.out.println("------------------------------------------------------------\n");

        for(Instructor instructor : instructors){
            instructorManager.deleteInstructor(instructor);
        }

    }
}

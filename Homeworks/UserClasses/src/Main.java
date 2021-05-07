public class Main {

    public static void main(String[] args) {

    	UserManager userManager1 = new UserManager();
    	userManager1.add(new Student());

    	System.out.println("------------------------------------");

	    Student student = new Student("Ikra","Nergiz",1,"Java-React",0);
	    Instructor instructor = new Instructor("Engin","Demiroğ",2,"Java-React");

	    User[] users = new User[]{student,instructor};

        UserManager userManager2 = new UserManager();

	    for(User user : users){
	    	userManager2.add(user);
		}

		System.out.println("------------------------------------");

	    StudentManager studentManager = new StudentManager();
	    studentManager.add(student);

	    InstructorManager instructorManager = new InstructorManager();
	    instructorManager.add(instructor);
    }
}

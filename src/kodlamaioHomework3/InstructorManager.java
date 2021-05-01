package kodlamaioHomework3;

public class InstructorManager extends UserManager {
	
	public void login() {
		
		System.out.println("Instructor login success");
		
	}

	public void addEducation(Instructor instructor) {
		
		System.out.println(instructor.getEducationPojects()+" uploaded to the system !");
	}
	
}


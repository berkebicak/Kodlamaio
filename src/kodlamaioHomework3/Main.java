package kodlamaioHomework3;

public class Main {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Berke");
		student1.setLastName("Bıçak");
		student1.setCourse("JAVA");
		student1.setPassword("123");
		student1.setEmail("berke.bicak@hotmail.com");
		student1.setProgress("%65");
		
		Instructor instructor1 = new Instructor("engindemirog@kodlama.io","567",2,"Engin","Demirog","C# Learning");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.login(student1);
		studentManager.add(student1);
		studentManager.delete(student1);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor1);
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.addEducation(instructor1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

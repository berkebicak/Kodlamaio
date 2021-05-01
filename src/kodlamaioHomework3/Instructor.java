package kodlamaioHomework3;

public class Instructor extends User {
	
	private String educationPojects;
    
	public Instructor() {}
	
	
	
	public Instructor(String email, String password, int id, String firstName, String lastName,	String educationPojects) {
		
		super(email, password, id, firstName, lastName);
		this.educationPojects = educationPojects;
	}



	public String getEducationPojects() {
		return educationPojects;
	}



	public void setEducationPojects(String educationPojects) {
		this.educationPojects = educationPojects;
	}
	
	
	
	
	

}

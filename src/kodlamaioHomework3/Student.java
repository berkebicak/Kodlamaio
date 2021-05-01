package kodlamaioHomework3;

public class Student extends User {
	
	private String course;
	private String progress;
	
	public Student() {
		
	}
	
	
	public Student(String email, String password, int id, String firstName, String lastName, String course,
			String progress) {
		super(email, password, id, firstName, lastName);
		this.course = course;
		this.progress = progress;
	}


	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	


	
	
	
}

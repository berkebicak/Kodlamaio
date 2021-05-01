package kodlamaioHomework3;

public class UserManager  {
	
		public void login(User user) {
				
		System.out.println("Logging in ..."+" Welcome "+user.getFirstName());
		System.out.println("---------------------------");
		
		}
		
		
		public void add(User user) {
			
		System.out.println("User added : "+user.getFirstName()+" "+user.getLastName());
	}

		public void delete(User user) {
			
			System.out.println("User deleted !"+" Id number : "+user.getId());
			System.out.println("---------------------------");
}
}



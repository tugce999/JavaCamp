package ödev3;

public class Main {

	public static void main(String[] args) {
		
		//USER
		User user = new User("Tugce", "Ardec", "tugcenurardec99@gmail.com", "tugce99", "999");
		
		//INSTRUCTOR
		Instructor instructor = new Instructor("Engin", "Demirog", "engindemirog@gmail.com", "engindemirog","1234", 20);
		
		//STUDENT
		Student student = new Student("Aynur", "Ardec", "aync93@gmail.com", "anur","12345", "Marmara Üniversitesi", "Bilgisayar Mühendisligi");
				
		//USER MANAGER
		UserManager userManager = new UserManager();
		
		userManager.addUser(user);
		userManager.signIn(user);
		userManager.signOut(user);
		userManager.changeEmail(user, "deneme@gmail.com");
		userManager.changePassword(user, "deneme");
		userManager.changeUsername(user, "tugce");
		userManager.getInformation(user);
		userManager.removeUser(user);
		
		//INSTRUCTOR MANAGER
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.addUser(instructor);
		instructorManager.getInformation(instructor);
		instructorManager.removeUser(instructor);
		
		//STUDENT MANAGER
		StudentManager studentManager = new StudentManager();
		
		instructorManager.addUser(student);
		instructorManager.getInformation(student);
		instructorManager.removeUser(student);
		
	}

}

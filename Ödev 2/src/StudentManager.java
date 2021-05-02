
public class StudentManager {
	public void add(Student student) {
		System.out.println(student.firstName + " "+student.lastName+" Eklendi");
	}
	
	public void delete(Student student) {
		System.out.println(student.firstName + " "+student.lastName+" Silindi");
	}
	
	public void showAllStudents(Student[] students) {
		System.out.println("Tüm Ögrenciler");
		for(Student student:students) {
			System.out.println(student.firstName+" "+student.lastName);
		}
	}
}
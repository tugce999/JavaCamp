public class Main {

	public static void main(String[] args) {

		Lecture lecture1=new Lecture(1, "Java", "+React", "Engin Demirog");
		Lecture lecture2=new Lecture(2, "Python", "", "Engin Demirog");
		Lecture lecture3=new Lecture(3, "Programlamaya Giris", "", "Engin Demirog");
		
		Lecture[] lectures= {lecture1,lecture2,lecture3};
		
		LectureManager lectureManager=new LectureManager();
		lectureManager.add(lecture1);
		lectureManager.add(lecture2);
		lectureManager.add(lecture3);
		System.out.println();
		lectureManager.delete(lecture2);
		System.out.println();
		lectureManager.showAllLectures(lectures);
		System.out.println();
		
		Student student1=new Student(1, "isim1", "Soyisim1", "mail1@gmail.com");
		Student student2=new Student(2, "isim2", "Soyisim2", "mail2@gmail.com");
		Student student3=new Student(3, "isim3", "Soyisim3", "mail3@gmail.com");
		Student student4=new Student(4, "isim4", "Soyisim4", "mail4@gmail.com");
		Student student5=new Student(5, "isim5", "Soyisim5", "mail5@gmail.com");
		
		Student[] students= {student1,student2,student3,student4,student5};
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		studentManager.add(student4);
		studentManager.add(student5);
		System.out.println();
		studentManager.delete(student1);
		studentManager.delete(student5);
		System.out.println();
		studentManager.showAllStudents(students);
		
	}

}
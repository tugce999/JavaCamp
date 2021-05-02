
public class LectureManager {
	public void add(Lecture lecture) {
		System.out.println(lecture.name + " Dersi Eklendi");	   	
	}
	
	public void delete(Lecture lecture) {
		System.out.println(lecture.name + " Dersi Silindi");		
	}
	
	public void showAllLectures(Lecture[] lectures) {
		System.out.println("Tüm Dersler");
		for(Lecture lecture:lectures) {
			System.out.println(lecture.name);
		}
	}
}


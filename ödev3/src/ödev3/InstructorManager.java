package ödev3;

import ödev3.Instructor;
import ödev3.UserManager;

public class InstructorManager extends UserManager {

	public void getInformation(Instructor instructor) {
		System.out.println("Ögretmenin Adi: "+ instructor.getFirstName() + " "+ instructor.getLastName());
		System.out.println("Ýletisim: "+ instructor.getEmail());
		System.out.println("Tecrübe Yili: "+ instructor.getExperience());

	}
	
	public void addUser(Instructor i) {

		Instructor instructor = new Instructor(i.getFirstName(), i.getLastName(), i.getEmail(), 
												i.getUsername(), i.getPassword(), i.getExperience());
		i.instructors.add(instructor);
		System.out.println("Ögretmen Olusturuldu");
	}

	public void removeUser(Instructor ins) {
		String username = ins.getUsername();
		
		for(int i=0;i<ins.instructors.size();i++) {
			if(ins.instructors.get(i).getUsername().equals(username)) {
				System.out.println("Kullanici adinizi Degistirmek için sifrenizi Giriniz: ");
				String password = scanner.nextLine();
				
				if(password.equals(ins.instructors.get(i).getPassword())) {
					ins.instructors.remove(i);
					System.out.println("Ögretmen Silindi");
				}
				else {
					System.out.println("Yanlis sifre Girdiniz. Ýsleminiz Gerçeklestirilemedi.");
				}
			}
			else {
				System.out.println("Böyle bir ögretmen profili bulunamadi.");
			}
		}
	}
}

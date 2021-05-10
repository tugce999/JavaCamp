package ödev3;

import java.util.Scanner;



public class UserManager {
	
	Scanner scanner = new Scanner(System.in);
	
	// SIGN IN
	public void signIn(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " Hesabýnýza Basarýyla Giris Yapýldý");
			
	}
	
	//SIGN OUT
	public void signOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Hesabýnýzdan Çýkýs Yapýldý");
	}
	
	// REGISTER
	public void addUser(User u) {

		User user = new User(u.getFirstName(), u.getLastName(), u.getEmail(), u.getUsername(), u.getPassword());
		u.users.add(user);
		System.out.println("Kullanýcý Olusturuldu");
	}
	
	//DELETE ACCOUNT
	public void removeUser(User u) {
		String username = u.getUsername();
		
		for(int i=0;i<u.users.size();i++) {
			if(u.users.get(i).getUsername().equals(username)) {
				System.out.println("Kullanýcý Adýnýzý Degistirmek için Sifrenizi Giriniz: ");
				String password = scanner.nextLine();
				
				if(password.equals(u.users.get(i).getPassword())) {
					u.users.remove(i);
					System.out.println("Kullanýcý Silindi");
				}
				else {
					System.out.println("Yanlýs Sifre Girdiniz. Ýsleminiz Gerceklestirilemedi.");
				}
			}
			else {
				System.out.println("Böyle bir kullanýcý bulunamadý.");
			}
		}
	}
	
	//CHANGE EMAIL
	public void changeEmail(User user, String newEmail) {
		System.out.println("Degistirmek Ýstediginiz Mail: " + user.getEmail());
		System.out.println("Yeni Mail Adresiniz: "+ newEmail);
		
		user.setEmail(newEmail);
		
		System.out.println("Mail Adresiniz Basarýyla Degiþtirildi");
	}
	
	// CHANGE PASSWORD
	public void changePassword(User user, String newPassword) {
		
		System.out.println("Sifrenizi degiþtirmek istiyor musunuz? (E/H)");
		String chose = scanner.nextLine();
		
		if(chose.equals("E")) {
			user.setPassword(newPassword);
			System.out.println("Sifreniz Basarýyla Degistirildi");	
		}
		else if(chose.equals("H")) {
			System.out.println("Sifre degisiligi onaylanmadý. Sifre degisimi yapýlamadý.");	
		}
		
	}
	
	// CHANGE USERNAME
	public void changeUsername(User user, String newUsername) {
		System.out.println("Degistirmek Ýstediginiz Kullanýcý Adýnýz: " + user.getUsername());
		System.out.println("Yeni Kullanýcý Adýnýz: "+ newUsername);
		
		user.setUsername(newUsername);
		
		System.out.println("Kullanýcý Adýnýzý Baþariyla Degiþtirildi");
	}
	
	// GET INFORMATION
	public void getInformation(User user) {
		System.out.println("Kullanýcinin Gercek Adý: "+ user.getFirstName() + " "+ user.getLastName());
		System.out.println("Ýletisim: "+ user.getEmail());
		System.out.println("Kullanici Adi: "+ user.getUsername());
	}
}

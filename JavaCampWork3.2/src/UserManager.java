
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+ " " +user.getLastName()+ " isimli kullan�c� sisteme eklendi.");
		System.out.println("Email: " +user.getEmail()+ " " +"�ifre: " +user.getPassword());
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+ " " +user.getLastName()+ " isimli kullan�c� sistemden silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+ " " +user.getLastName()+ " isimli kullan�c� bilgileri g�ncellendi.");
	}

}

package Core;

import Entities.Concretes.User;
import GoogleAuth.GoogleAuthentication;

public class GoogleAuthenticationAdapter {

	public void login(User user) {
		GoogleAuthentication googleAuthentication = new GoogleAuthentication();
		googleAuthentication.login(user.getEmail());
		
	}
	
	
	
}

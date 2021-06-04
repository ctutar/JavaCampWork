package Business.Concretes;

import Business.Abstracts.VerificationService;
import Entities.Concretes.User;

public class MailVerification implements VerificationService{

	@Override
	public void login(User user) {
		System.out.println("Verification code is sended to "+user.getEmail());		
	}
	
}

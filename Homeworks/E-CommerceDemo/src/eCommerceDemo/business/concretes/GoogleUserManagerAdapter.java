package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.GoogleService;
import eCommerceDemo.core.concretes.GoogleUserManager;
import eCommerceDemo.entities.concretes.User;

public class GoogleUserManagerAdapter implements GoogleService{

	@Override
	public boolean isValid(User user) {
		
		GoogleUserManager manager = new GoogleUserManager();
		if(manager.isValid(user)) {
			System.out.println("Google hesap bilgileri doðru : " + user.getFirstName());
			return true;
		}
		return false;
	}
}

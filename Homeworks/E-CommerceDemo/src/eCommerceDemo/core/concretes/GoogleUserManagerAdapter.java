package eCommerceDemo.core.concretes;

import eCommerceDemo.core.abstracts.GoogleService;
import eCommerceDemo.entities.concretes.User;
import GoogleManager.GoogleUserManager;

public class GoogleUserManagerAdapter implements GoogleService{

	@Override
	public boolean isValid(User user) {
		
		GoogleUserManager manager = new GoogleUserManager();
		if(manager.isValid(user)) {
			return true;
		}
		return false;
	}
}

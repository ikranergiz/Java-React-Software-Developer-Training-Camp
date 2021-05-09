package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface CheckService {
	
	boolean isValid(User user);
	

}

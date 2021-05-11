package eCommerceDemo.business.abstracts;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	
	boolean signUp(User user);
	void logIn(String email,String password);
	List<User> users = new ArrayList<User>();

}

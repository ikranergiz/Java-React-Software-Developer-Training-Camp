package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.GoogleUserManagerAdapter;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User("ýkra","nergix","ikra12@gmail.com","passkdjfksd ");
		
		UserService userService = new UserManager(new HibernateUserDao(),new GoogleUserManagerAdapter());
		
		userService.uyeOl(user);
	

	}

}

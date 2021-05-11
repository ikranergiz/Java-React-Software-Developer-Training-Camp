package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.UserCheckManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.concretes.GoogleUserManagerAdapter;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User("Ikra","Nergiz","ikra12@gmail.com","123456");
		User user1 = new User("Ala","Nergiz","adasdsa@icloud.com","passkdjfksd");
		User user2 = new User("Ikra","Nergiz","ikra12@gmail.com","sadjkasdj");
		User user3 = new User("Emir","Nergiz","emir12@gmail.com","passk");
		
		UserService userService = new UserManager(new HibernateUserDao(),new UserCheckManager());
		
		userService.signUp(user);
		System.out.println("--------------------------------------------------------------------------------------------------------");
		userService.signUp(user1);
		System.out.println("--------------------------------------------------------------------------------------------------------");
		userService.signUp(user2);
		System.out.println("--------------------------------------------------------------------------------------------------------");
		userService.signUp(user3);
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		userService.logIn(user.getEmail(),user.getPassword());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		userService.logIn(user3.getEmail(),user3.getPassword());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		UserService google = new UserManager(new HibernateUserDao(),new GoogleUserManagerAdapter());
		
		User user4 = new User("Emre","Yýlmaz","emre89@gmail.com","123456");
		User user5 = new User("Ahmet","Sönmez","adas34783@icloud.com","passkdjfksd");
		User user6 = new User("Esra","Nergiz","esranergiz@gmail.com","sadj3");
		User user7 = new User("Kaan","Bilge","emre89@gmail.com","passksda");
		
		google.signUp(user4);
		System.out.println("--------------------------------------------------------------------------------------------------------");
		google.signUp(user5);
		System.out.println("--------------------------------------------------------------------------------------------------------");
		google.signUp(user6);
		System.out.println("--------------------------------------------------------------------------------------------------------");
		google.signUp(user7);
		
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		userService.logIn(user4.getEmail(),user4.getPassword()+"fsldk");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		userService.logIn(user4.getEmail(),user4.getPassword());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		
		
		
		
	

	}

}

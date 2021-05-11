package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.CheckService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private CheckService checkService;

	
	public UserManager(UserDao userDao , CheckService checkService) {
		this.userDao = userDao;
		this.checkService = checkService;
	}

	@Override
	public boolean signUp(User user) {
		
		for(User user1 : users) {
			if(user1.getEmail().equals(user.getEmail())) {
				System.out.println("This email has already been used.Try again.");
				return false;
			}
		}
		
		if(this.checkService.isValid(user)) {
			System.out.println("Your registration has been completed successfully! " + user.getFirstName().toUpperCase() + " " + user.getLastName().toUpperCase());
			this.userDao.addToSystem(user);
			users.add(user);
			sendEmail();
			return true;
		}
		else {
			System.out.println("Your registiration failed.Try again.");
			return false;
		}
		
	}

	@Override
	public void logIn(String email,String password) {
		
		if(email.length() == 0 || password.length() == 0) {
			System.out.println("Email and password are required.");
			return;
		}
		for(User user1 : users) {
			if(user1.getEmail().equals(email) && user1.getPassword().equals(password)) {
				System.out.println("Successfully logged in "+ user1.getFirstName().toUpperCase() + " " + user1.getLastName().toUpperCase());
				return;
			}
		}
		System.out.println("There is no such user.Try again.");
		
	}

	public void sendEmail() {
		System.out.println("Verification link has been sent to your email!");
		click();
		
	}
	public void click() {
		System.out.println("Your e-mail verification has been completed successfully.");
	}

	

}

package GoogleManager;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.entities.concretes.User;

public class GoogleUserManager {
	
	List<User> users = new ArrayList<User>();
	
	public boolean isValid(User user) {
		
		String format = "^[\\w.+\\-]+@gmail\\.com$"; 
		
		Pattern pt = Pattern.compile(format);
		Matcher mt = pt.matcher(user.getEmail());
		
		if(!mt.matches()) {
			System.out.println("Invalid e-mail.");
			return false;
		}
		
		if(user.getFirstName().length() <= 2 || user.getLastName().length() <= 2) {
			System.out.println("Name and surname must be at least 2 characters.");
			return false;
			
		}
		if(user.getPassword().length() < 6) {
			System.out.println("Password must be at least 6 characters.");
			return false;
		}
		
		for(User user1 : users) {
			if(user1.getEmail().equals(user.getEmail())) {
				System.out.println("This email has already been used.Try again.");
				return false;
			}
		}
		return true;
		
	}

}

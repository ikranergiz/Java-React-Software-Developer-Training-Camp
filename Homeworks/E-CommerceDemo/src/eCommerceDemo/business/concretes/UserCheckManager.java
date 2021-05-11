package eCommerceDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.CheckService;
import eCommerceDemo.entities.concretes.User;

public class UserCheckManager implements CheckService{
	
	@Override
	public boolean isValid(User user) {
		if(user.getFirstName().length() <= 2 || user.getLastName().length() <= 2) {
			System.out.println("Name and surname must be at least 2 characters.");
			return false;
			
		}
		if(user.getPassword().length() < 6) {
			System.out.println("Password must be at least 6 characters.");
			return false;
		}
		
		String format = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
		
		
		Pattern pt = Pattern.compile(format);
		Matcher mt = pt.matcher(user.getEmail());
		
		if(!mt.matches()) {
			System.out.println("Invalid e-mail.");
			return false;
		}
		
		else{ 
			return true;
		}
		
	}
}

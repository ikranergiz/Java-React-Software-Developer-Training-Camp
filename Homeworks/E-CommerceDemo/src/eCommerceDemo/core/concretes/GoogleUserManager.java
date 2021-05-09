package eCommerceDemo.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.entities.concretes.User;

public class GoogleUserManager {
	
	
	public boolean isValid(User user) {
		
		if(user.getFirstName().length() <= 2 || user.getLastName().length() <= 2) {
			System.out.println("ad ve soyad 2 karakterden uzun olmalý");
			return false;
			
		}
		if(user.getPassword().length() < 6) {
			System.out.println("password en az 6 karakter olmalý");
			return false;
		}
		
		String format =  "^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$";
		
		
		Pattern pt = Pattern.compile(format);
		Matcher mt = pt.matcher(user.getEmail());
		
		if(!mt.matches()) {
			System.out.println("e mail formatý yanlýþ");
			return false;
		}
		return true;
		
	}

}

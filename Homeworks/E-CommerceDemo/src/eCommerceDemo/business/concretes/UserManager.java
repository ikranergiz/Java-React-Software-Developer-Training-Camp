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
	public boolean uyeOl(User user) {
		
		if(this.checkService.isValid(user)) {
			
			System.out.println("uye olundu : " + user.getFirstName());
			this.userDao.addToSystem(user);
			return true;
		}
		else {
			System.out.println("uye olunamad� tekrar deneyin : " + user.getFirstName());
			return false;
		}
		
	}

	@Override
	public void girisYap(User user) {
		if(this.uyeOl(user)) {
		System.out.println("giri� yap�ld� : " + user.getFirstName());
		}
		else {
			System.out.println("b�yle bir uye yok");
		}
	}

	

}

package eCommerceDemo.dataAccess.concretes;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public boolean addToSystem(User user) {
	
		System.out.println("bilgiler doðru,hibernate ile veri tabanýna eklendi");
		return true;
	}
	

}

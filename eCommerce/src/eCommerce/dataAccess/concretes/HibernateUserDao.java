package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{
List<User> users=new ArrayList<User>();
	@Override
	public void add(User user) {
		System.out.println("Ekleme iþlemi yapýldý : " + user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getEmail(String email) {
       for (User user : users) {
		if (user.getEmail()==email) {
			return true;
		}
	}
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		   for (User user : users) {
				if (user.getPassword()==password) {
					return true;
				}
			}
		return false;
	}

}

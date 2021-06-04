package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class DatabaseUserDao implements UserDao {

	private List<User> users;
	
	public DatabaseUserDao() {
		users = new ArrayList<User>();
	
	}
	
	@Override
	public void add(User user) {
		System.out.println("User added. " + user.getFirstName() + " " + user.getLastName());
		users.add(user);		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated. " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted. " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public User getUser(String email) {
		for(User user : users) {
			if( user.getEmail().equals(email)) {
				return user;
			}
		}		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}


}
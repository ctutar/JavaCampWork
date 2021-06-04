package DataAccess.Abstracts;

import java.util.List;

import Entities.Concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	User getUser(String email);
	List<User> getAll();
	
}


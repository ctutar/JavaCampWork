package Business.Abstracts;

import java.util.List;

import Entities.Concretes.User;

public interface UserService {

	void add(User user) throws InterruptedException;
	void delete(User user);
	void update(User user);
	User getUser(String mail);
	List<User> getAll();
	
}

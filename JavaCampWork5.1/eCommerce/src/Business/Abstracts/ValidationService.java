package Business.Abstracts;

import Entities.Concretes.User;

public interface ValidationService {
	boolean isValid(User user);

}
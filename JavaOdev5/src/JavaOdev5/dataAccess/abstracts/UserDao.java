package JavaOdev5.dataAccess.abstracts;



import java.util.List;

import JavaOdev5.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	List<User> getAll();
	
	
}

package JavaOdev5.business.abstracts;

import JavaOdev5.entities.concretes.User;

public interface LoginService {
	void existEmail(String email);
	void register(User user);
	void login(String email, String password);
}

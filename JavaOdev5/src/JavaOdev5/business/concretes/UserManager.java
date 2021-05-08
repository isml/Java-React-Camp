package JavaOdev5.business.concretes;

import JavaOdev5.business.abstracts.LoginService;
import JavaOdev5.business.abstracts.UserService;
import JavaOdev5.core.abstracts.OutSourceServices;
import JavaOdev5.entities.concretes.User;

public class UserManager implements UserService {

	private LoginService loginService;
	private OutSourceServices outService;
	
	public UserManager(LoginService loginService, OutSourceServices outService) {
		this.loginService = loginService;
		this.outService = outService;
	}

	@Override
	public void register(User user) {
		loginService.register(user);
	}
	@Override
	public void login(String email, String password) {
		loginService.login(email, password);
	}
	@Override
	public void registerWithService() {
		outService.registerWith();
	}

	@Override
	public void loginWithService() {
		outService.loginWith();
	}

}

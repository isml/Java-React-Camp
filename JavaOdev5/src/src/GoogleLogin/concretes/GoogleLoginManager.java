package src.GoogleLogin.concretes;

import src.GoogleLogin.abstracts.GoogleLoginService;

public class GoogleLoginManager implements GoogleLoginService {

	@Override
	public void register() {
		System.out.println("Google hesabınız ile kayıt oldunuz.");
	}

	@Override
	public void login() {
		System.out.println("Google hesabınız ile giriş yaptınız. ");
	}

}

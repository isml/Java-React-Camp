package JavaOdev5.core.adapters;

import src.GoogleLogin.concretes.GoogleLoginManager;
import JavaOdev5.core.abstracts.OutSourceServices;

public class GoogleLoginManagerAdapter implements OutSourceServices {

	@Override
	public void registerWith() {
		GoogleLoginManager googleManager = new GoogleLoginManager();
		googleManager.register();
	}

	@Override
	public void loginWith() {
		GoogleLoginManager googleManager = new GoogleLoginManager();
		googleManager.login();
	}
}

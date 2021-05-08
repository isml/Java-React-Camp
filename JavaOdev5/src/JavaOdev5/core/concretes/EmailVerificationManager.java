package JavaOdev5.core.concretes;

import JavaOdev5.core.abstracts.EmailVerificationService;
import JavaOdev5.entities.concretes.User;

public class EmailVerificationManager implements EmailVerificationService{

	@Override
	public void verifyEmail(User user) {
		// TODO Auto-generated method stub
		System.out.println("*-*-*-*-*--*-*-*-*-*-*-*-*-*-");
		System.out.println(user.getEmail() + " adresinize gönderilen doğrulama linkine tıklayınız.");
	}

	@Override
	public boolean isVerified(User user) {
		// TODO Auto-generated method stub
		System.out.println("Sayın " + user.getFirstName() + " e-posta adresiniz başarıyla doğrulandı.");
		return true;
	}

}

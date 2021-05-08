package JavaOdev5.core.abstracts;

import JavaOdev5.entities.concretes.User;

public interface EmailVerificationService {
	void verifyEmail(User user);
	boolean isVerified(User user);
}

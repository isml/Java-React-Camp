package JavaOdev5.business.concretes;

import JavaOdev5.business.abstracts.LoginService;
import JavaOdev5.core.abstracts.CheckServices;
import JavaOdev5.core.abstracts.EmailVerificationService;
import JavaOdev5.dataAccess.abstracts.UserDao;
import JavaOdev5.entities.concretes.User;

public class LoginManager implements LoginService {

	private UserDao userDao;
	private CheckServices checkService;
	private EmailVerificationService verifycationEmail;

	public LoginManager(UserDao userDao, CheckServices checkService, EmailVerificationService verifycationEmail) {
		this.userDao = userDao;
		this.checkService = checkService;
		this.verifycationEmail = verifycationEmail;
	}

	@Override
	public void existEmail(String email) {
		for (User user : userDao.getAll()) {
			if (user.getEmail() == email) {
				throw new ArithmeticException("E-Posta adresi sistemde kayıtlı bulunmakta.");
			}
		}
	}

	@Override
	public void register(User user) {
		this.existEmail(user.getEmail());
		if (!checkService.checkEmail(user.getEmail())) {
			return;
		}
		System.out.println("Email Kontrolü Başarılı.");
		if (!checkService.checkFirstName(user.getFirstName())) {
			return;
		}
		System.out.println("İsim Kontrolü Başarılı.");
		if (!checkService.checkPassword(user.getPassword())) {
			return;
		}
		System.out.println("Şifre Kontrolü Başarılı.");
		if (!checkService.checkLastname(user.getLastName())) {
			return;
		}
		System.out.println("Soyisim Kontrolü Başarılı.");
		verifycationEmail.verifyEmail(user);
		verifycationEmail.isVerified(user);
		userDao.add(user);
		System.out.println(
				"Sayın " + user.getFirstName() + " " + user.getLastName() + " kayıt işleminiz başarıyla gerçekleşti.");
	}

	@Override
	public void login(String email, String password) {
		if (!checkService.checkEmail(email)) {
			return;
		}
		if (!checkService.checkPassword(password)) {
			return;
		}
		for (User user : userDao.getAll()) {
			if (email == user.getEmail() && password == user.getPassword()) {
				System.out.println(user.getFirstName() + " " + user.getLastName() + " Başarıyla giriş yaptınız.");
				return;
			}
		}
		System.out.println("Hatalı eposta adresi veya parola girdiniz. Lütfen tekrar deneyin.");
		return;

	}
}

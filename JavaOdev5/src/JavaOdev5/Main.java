package JavaOdev5;

import JavaOdev5.business.abstracts.UserService;
import JavaOdev5.business.concretes.LoginManager;
import JavaOdev5.business.concretes.UserManager;
import JavaOdev5.core.adapters.GoogleLoginManagerAdapter;
import JavaOdev5.core.concretes.CheckServicesManager;
import JavaOdev5.core.concretes.EmailVerificationManager;
import JavaOdev5.dataAccess.concretes.UserDaoMemory;
import JavaOdev5.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserManager(new LoginManager(new UserDaoMemory(), new CheckServicesManager(), new EmailVerificationManager()), 
				  new GoogleLoginManagerAdapter());
		System.out.println("*-*-*-*-*-*-*-*-Doğru giriş ile kullanıcı kaydediliyor*-*-*-*-*-*-*-*-".toUpperCase());
		User firstUser = new User();
		firstUser.setId(0);
		firstUser.setFirstName("İsmail");
		firstUser.setLastName("Karakaş");
		firstUser.setEmail("isml.krks46@gmail.com");
		firstUser.setPassword("654321321");
		userService.register(firstUser);
		System.out.println("*-*-*-*-*-*-*-*-Doğru giriş ile kullanıcı girişi yapılıyor*-*-*-*-*-*-*-*-".toUpperCase());
		userService.login("isml.krks46@gmail.com", "654321321");	
		System.out.println("");
		System.out.println("*-*-*-*-*-*-*-*-Hatalı giriş ile kullanıcı kaydediliyor*-*-*-*-*-*-*-*-".toUpperCase());
		
		
		User secondUser = new User();
		secondUser.setId(1);
		secondUser.setFirstName("İ");
		secondUser.setLastName("K");
		secondUser.setEmail("ismlgmail.com");
		secondUser.setPassword("621");
		userService.register(secondUser);
		System.out.println("*-*-*-*-*-*-*-*-Hatalı giriş ile kullanıcı girişi yapılıyor*-*-*-*-*-*-*-*-".toUpperCase());
		userService.login("aliveli.krks46@gmail.com", "654321321");
	}

}

package JavaOdev5.core.concretes;
import JavaOdev5.core.abstracts.CheckServices;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CheckServicesManager implements CheckServices{

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		if (!email.isEmpty() && matchFound) {
			return true;
		} else {
			System.out.println("Hatalı mail girdiniz");
			return false;
		}
	}

	@Override
	public boolean checkPassword(String password) {
		// TODO Auto-generated method stub
		if (password.length() >= 6) {
			return true;
		} else {
			System.out.println("\"Şifre minimum 6 karakterden oluşmalıdır.\"");
			return false;
		}
	}

	@Override
	public boolean checkFirstName(String firstName) {
		// TODO Auto-generated method stub
		if (firstName.length() >= 2) {
			return true;
		} else {
			System.out.println("İsim bilgisi en az 2 karakterden oluşmalıdır");
			return false;
		}
	}

	@Override
	public boolean checkLastname(String lastName) {
		// TODO Auto-generated method stub
		if (lastName.length() >= 2) {
			return true;
		} else {
			System.out.println("Soyisim bilgisi en az 2 karakterden oluşmalıdır");
			return false;
		}
	}

}

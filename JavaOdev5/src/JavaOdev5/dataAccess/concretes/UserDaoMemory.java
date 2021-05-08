package JavaOdev5.dataAccess.concretes;
import JavaOdev5.dataAccess.abstracts.UserDao;
import java.util.ArrayList;
import java.util.List;
import JavaOdev5.entities.concretes.User;

public class UserDaoMemory implements UserDao{
	public	List<User> users;
	public UserDaoMemory() {
		this.users = new ArrayList<User>();
	}
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		this.users.add(user);
		System.out.println(user.getFirstName()+" "+ user.getLastName()+ " isimli kullanıcı kaydı başarılı");
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

	

}

package ro.telacad.repo;

import org.springframework.stereotype.Repository;

import ro.telacad.entities.User;

@Repository
public class UserRepo {

	public User findUserByUsername(String username) {
		User user = new User();
		
		user.setId(1000);
		user.setUsername(username);
		user.setPassword("12345");
		
		return user;
	}
	
	public void storeUser(User user) {
		System.out.println("User added...");
	}
}

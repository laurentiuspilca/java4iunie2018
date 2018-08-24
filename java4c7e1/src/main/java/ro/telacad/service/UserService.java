package ro.telacad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.telacad.entities.User;
import ro.telacad.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;

	public boolean login(String username, String password) {
		User user = userRepo.findUserByUsername(username);
		if (user != null && user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}
	
	public boolean register(String username, String password) {
		User user = userRepo.findUserByUsername(username);
		
		if (user == null) {
			user = new User();
			user.setUsername(username);
			user.setPassword(password);
			userRepo.storeUser(user);
			return true;
		}
		
		return false;
	}
}

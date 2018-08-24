package ro.telacad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import ro.telacad.entities.User;
import ro.telacad.repo.UserRepo;
import ro.telacad.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceLoginTests {
	
	@MockBean
	private UserRepo userRepo;

	@Autowired
	private UserService userService;
	
	@Test
	public void loginCorrectTest() {
		String username = "username";
		String password = "password";
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		when(userRepo.findUserByUsername(username)).thenReturn(user);
		
		boolean result = userService.login(username, password);
		
		assertTrue(result);
	}
	
	@Test
	public void loginUserIncorrectTest() {
		String username = "username";
		String password = "password";
		
		when(userRepo.findUserByUsername(username)).thenReturn(null);
		
		boolean result = userService.login(username, password);
		
		assertFalse(result);
	}
	
	@Test
	public void loginPasswordncorrectTest() {
		String username = "username";
		String password = "password";
		
		User user = new User();
		user.setUsername(username);
		user.setPassword("other_password");
		when(userRepo.findUserByUsername(username)).thenReturn(user);
		
		boolean result = userService.login(username, password);
		
		assertFalse(result);
	}

}

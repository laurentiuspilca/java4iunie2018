package ro.telacad;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
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
public class UserRegisterTest {

	@Autowired
	private UserService userService;
	
	@MockBean
	private UserRepo userRepo;
	
	@Test
	public void registerExistingUser() {
		String username = "username";
		String password = "password";
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		when(userRepo.findUserByUsername(username)).thenReturn(user);
		
		boolean result = userService.register(username, password);
		
		assertFalse(result);
		verify(userRepo,never()).storeUser(any());
	}
	
	@Test
	public void registerSuccess() {
		String username = "username";
		String password = "password";
		
		when(userRepo.findUserByUsername(username)).thenReturn(null);
		
		boolean result = userService.register(username, password);
		
		assertTrue(result);
		
		verify(userRepo).storeUser(any());
		
	}
	
	// @Before, @After, @BeforeClass, @AfterClass
}

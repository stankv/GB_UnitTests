package User.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import User.UserRepository;
import User.UserService;

public class IntegrationTest {
    
    @Test
    public void integrationTest() {
        UserRepository userRepository = new UserRepository();
        UserService UserService = new UserService(userRepository);

        assertEquals("User 1", UserService.getUserName(1));
    }
}

package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Users.User;


class UserTest {

    @Test
    public void authTrue(){
        User user = new User("user1", "pass1", true);
        Assertions.assertTrue(user.auth("user1", "pass1"));
    }

    @Test
    public void authFalse(){
        User user = new User("user1", "pass1", false);
        Assertions.assertFalse(user.auth("user2", "pass2"));
    }
}
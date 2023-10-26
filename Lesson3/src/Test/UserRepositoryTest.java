package Test;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

import Users.User;
import Users.UserRepository;


public class UserRepositoryTest {
    
    // Проверка метода addUser() на добавление авторизованного пользователя в репозиторий.
    @Test
    public void checkAddAuthUserInRepo() {
        User user = new User("user1", "pass1", false);
        user.auth("user1", "pass1");
        UserRepository repository = new UserRepository();
        repository.addUser(user);
        assertThat(repository.autorizedUsers).contains(user);
    }

    @Test
    public void checkNotAddNotAuthUserInRepo() {
        User user = new User("user1", "pass1", false);
        user.auth("user1", "pass2");
        UserRepository repository = new UserRepository();
        repository.addUser(user);
        assertThat(repository.autorizedUsers).doesNotContain(user);
    }


    // Проверка метода logOutAllUsersIsNotAdmin(), удаляющего из репозитория всех пользователей,
    // не являющихся админами.
    @Test
    public void checkLogOutAllUsersIsNotAdmin() {
        UserRepository repository = new UserRepository();

        User user1 = new User("user1", "pass1", false);
        user1.auth("user1", "pass1");
        repository.autorizedUsers.add(user1);
        User user2 = new User("user2", "pass2", true);
        user2.auth("user2", "pass2");
        repository.autorizedUsers.add(user2);
        User user3 = new User("user3", "pass3", false);
        user3.auth("user3", "pass3");
        repository.autorizedUsers.add(user3);
        User user4 = new User("user4", "pass4", true);
        user4.auth("user4", "pass4");
        repository.autorizedUsers.add(user4);

        repository.logOutAllUsersIsNotAdmin();

        assertThat(repository.autorizedUsers.size()).isEqualTo(2);
    }
}

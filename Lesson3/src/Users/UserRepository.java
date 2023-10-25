// Добавьте класс UserRepository для управления пользователями. В этот класс должен быть включен 
// метод addUser, который добавляет пользователя в систему, если он прошел аутентификацию. 
// Покройте тестами новую функциональность.

// Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
// кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
// указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.

package Users;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User> autorizedUsers = new ArrayList<>();

    
    public void addUser(User user) {
        if (user.isAuth())
            autorizedUsers.add(user);
    }

    public void logOutAllUsersIsNotAdmin() {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (User user: autorizedUsers) {
                if (!user.isAdmin()) {
                    user.setAuth(false);
                    autorizedUsers.remove(user);
                    flag = true;
                    break;
                }
            }
        }
    }

}
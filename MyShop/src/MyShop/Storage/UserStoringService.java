package MyShop.Storage;

import MyShop.Enteties.User;
import MyShop.Enteties.impl.DefaultUser;

import java.util.List;

public interface UserStoringService {

    void saveUser(User user);

    List<User> loadUsers();
}

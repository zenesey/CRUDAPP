package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(long id);

    void removeUserById(long id);

    void updateUserById(long id, User user);

    void saveUser(User user);


}

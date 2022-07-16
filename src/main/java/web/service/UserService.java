package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(long id);

    void removeUserById(long id);

    void updateUserById(long id, User user);

    void saveUser(User user);


}

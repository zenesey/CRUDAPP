package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.models.User;

import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao ;


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);

    }

    @Override
    public void updateUserById(long id, User user) {
        userDao.updateUserById(id, user);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}

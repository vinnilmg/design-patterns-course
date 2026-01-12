package bridge.backend.service;

import bridge.backend.dao.UserDao;
import bridge.backend.model.User;

public class UserSoapService implements UserService {
    private final UserDao userDao;

    public UserSoapService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        System.out.println("Starting save user with SOAP protocol");
        userDao.save(user);
    }
}

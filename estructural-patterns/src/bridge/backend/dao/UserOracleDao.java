package bridge.backend.dao;

import bridge.backend.model.User;

public class UserOracleDao implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("Saving user in the Oracle DB");
    }
}

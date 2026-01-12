package bridge.backend;

import bridge.backend.dao.UserMongoDao;
import bridge.backend.dao.UserOracleDao;
import bridge.backend.model.User;
import bridge.backend.service.UserRestService;
import bridge.backend.service.UserSoapService;

public class Client {
    public static void main(String[] args) {
        final var user = new User("Vinicius", 25);

        final var restOracleService = new UserRestService(new UserOracleDao());
        restOracleService.save(user);

        final var soapOracleService = new UserSoapService(new UserOracleDao());
        soapOracleService.save(user);

        final var restMongoService = new UserRestService(new UserMongoDao());
        restMongoService.save(user);
    }
}

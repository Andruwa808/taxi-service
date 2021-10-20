package mate.service;

import java.util.Optional;
import mate.exception.AuthenticationException;
import mate.lib.Injector;
import mate.lib.Service;
import mate.model.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    private static final Injector injector = Injector.getInstance("mate");
    private final DriverService driverService =
            (DriverService) injector.getInstance(DriverService.class);

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isEmpty()) {
            logger.info("Login or password was incorrect. Params: login = {}", login);
            throw new AuthenticationException("Login or password was incorrect");
        }
        if (driver.get().getPassword().equals(password)) {
            logger.info("Login or password was correct. Params: login = {}", login);
            return driver.get();
        }
        logger.info("Login or password was incorrect. Params: login = {}", login);
        throw new AuthenticationException("Login or password was incorrect");
    }
}

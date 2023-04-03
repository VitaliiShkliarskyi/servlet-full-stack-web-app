package app.dao;

import app.model.Driver;
import java.util.Optional;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}

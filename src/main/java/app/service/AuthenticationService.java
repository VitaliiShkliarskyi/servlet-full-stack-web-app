package app.service;

import app.exception.AuthenticationException;
import app.model.Driver;

public interface AuthenticationService {
    void register(Driver driver, String repeatPassword) throws AuthenticationException;

    Driver login(String email, String password) throws AuthenticationException;
}

package ru.form.security.service;

import ru.form.security.model.User;

/**
 * Service class for {@link ru.form.security.model.User}
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}

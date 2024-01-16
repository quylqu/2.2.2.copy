package web.services;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(long id);

    void save(User user);

    void update(long id, User user);

    void delete(long id);

}

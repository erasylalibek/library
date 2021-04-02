package kz.iitu.library.service;

import kz.iitu.library.model.User;

import java.util.List;

public interface IUserService {
    void createUser(User user);
    void deleteUser(Integer id);
    List<User> getAllUsers();
    User getUserByUsername(String username);
    List<User> userListWhoHasBook();

}

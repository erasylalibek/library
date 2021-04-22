package kz.iitu.library.service.impl;

import kz.iitu.library.model.User;
import kz.iitu.library.repository.UserRepository;
import kz.iitu.library.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService , UserDetailsService {

    @Autowired
    UserRepository repository;

    @Override
    public void createUser(User user) {
        repository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserByUsername(String username) {
        return repository.getByUsername(username);
    }

    @Override
    public List<User> userListWhoHasBook() {
        return repository.getAllByBooksIsNotNull();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = repository.getByUsername(s);

        if (user == null) {
            throw new UsernameNotFoundException("User: " + s + " not found!");
        }
        return user;
    }
}

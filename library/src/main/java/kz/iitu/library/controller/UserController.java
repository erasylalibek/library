package kz.iitu.library.controller;

import kz.iitu.library.model.User;
import kz.iitu.library.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    IUserService service;

    public void create(User user){
        service.createUser(user);
    }
    public void delete(Integer id){
        service.deleteUser(id);
    }
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }
    public List<User> userListWhoHasBook(){
        return service.userListWhoHasBook();
    }
    public User getUserByUsername(String username){
        return service.getUserByUsername(username);
    }

}

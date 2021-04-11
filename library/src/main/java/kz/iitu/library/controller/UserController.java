package kz.iitu.library.controller;

import kz.iitu.library.model.User;
import kz.iitu.library.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService service;

    @PostMapping(value = "/create")
    public void create(@RequestBody User user){
        service.createUser(user);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(name = "id") Integer id){
        service.deleteUser(id);
    }

    @GetMapping(value = "/all")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping(value = "/all/has/book")
    public List<User> userListWhoHasBook(){
        return service.userListWhoHasBook();
    }

    @GetMapping(value = "/find/")
    public User getUserByUsername(@RequestParam(name = "username") String username){
        return service.getUserByUsername(username);
    }

}

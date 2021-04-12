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

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody User user){
        service.createUser(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id){
        service.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<User> userListWhoHasBook(){
        return service.userListWhoHasBook();
    }

    @RequestMapping(value = "/username", method = RequestMethod.GET)
    public User getUserByUsername(@RequestParam(name = "username") String username){
        return service.getUserByUsername(username);
    }

}

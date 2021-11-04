package ir.reyhane.blog.modules.users.controller;

import ir.reyhane.blog.modules.users.models.User;
import ir.reyhane.blog.modules.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping(value = {"/",""},method = RequestMethod.GET)
    public List<User> getAll(){
   return this.userService.findALl();
    }
    @RequestMapping(value = {"/",""},method = RequestMethod.POST)
    public User registerUser(@RequestBody User user){
return userService.registerUser(user);
    }
}


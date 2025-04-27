package controller;

import generator.entity.User;
import generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.list();
    }

    @PostMapping
    public boolean createUser(@RequestBody User user) {
        return userService.save(user);
    }
}
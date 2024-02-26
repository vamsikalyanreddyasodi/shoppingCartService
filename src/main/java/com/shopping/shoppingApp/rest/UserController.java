package com.shopping.shoppingApp.rest;

import com.shopping.shoppingApp.entity.User;
import com.shopping.shoppingApp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

/* list of end points in user
/api/users/register (POST): Register a new user.
/api/users/login (POST): Login an existing user.
/api/users/logout (POST): Logout the current user.
/api/users/profile (GET): Get the profile of the current user.
/api/users/update (PUT): Update the profile of the current user.
/api/users/delete (DELETE): Delete the account of the current user.
/api/users/{id} (GET): Get the profile of a specific user (for admin).
 */
private UserService userService;

public UserController(UserService userService){
    this.userService=userService;
}
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable Integer userId){
        return userService.getUser(userId);
    }
    @PostMapping("/users")
    public User addUser(){
        return null;
    }
    @PutMapping("/users")
    public User saveUser(){
        return null;
    }
    @DeleteMapping("/users/{userId}")
    public User deleteUser(){
        return null;
    }
}

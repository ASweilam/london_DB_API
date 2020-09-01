package com.asweilam.londonv2.controllers;

import com.asweilam.londonv2.models.User;
import com.asweilam.londonv2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public ResponseEntity<List<User>> userList(){

        List<User> userList = userService.userList();

        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        User user = userService.getUser(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/london")
    public ResponseEntity<List<User>> londonList(){
        List<User> londonUsers = userService.londonList();
        return new ResponseEntity<>(londonUsers, HttpStatus.OK);
    }

    //CREATE
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody final User user){
        User user1 = userService.createUser(user);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }

    //DELETE
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //UPDATE
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user){
        User user1 = userService.updateUser(id, user);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }

}

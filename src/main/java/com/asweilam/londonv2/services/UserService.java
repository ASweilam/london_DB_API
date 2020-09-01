package com.asweilam.londonv2.services;

import com.asweilam.londonv2.models.User;

import java.util.List;

public interface UserService {

    List<User> userList();

    User getUser(Long id);

    User createUser(final User user);

    void deleteUser(Long id);

    User updateUser(Long id,User user);

    List<User> londonList();

}

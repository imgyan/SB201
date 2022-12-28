package com.masai.dao;

import com.masai.entities.User;
import com.masai.exceptions.UserNotFoundException;

import java.util.List;

public interface UserDao {

    public User createUser(User user) throws UserNotFoundException;

    public List<User> findByName(String name) throws UserNotFoundException;
}

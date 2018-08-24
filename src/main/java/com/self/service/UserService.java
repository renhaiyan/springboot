package com.self.service;

import com.self.domain.User;

import java.util.List;

public interface UserService {

    public List<User> findUser();

    public void addUser(User user);

    public void updateUser(int id);

    public void deleteUser(int id);
}

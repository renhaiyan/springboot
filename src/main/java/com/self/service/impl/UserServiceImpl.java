package com.self.service.impl;

import com.self.domain.User;
import com.self.mapper.UserMapper;
import com.self.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<com.self.domain.User> findUser() {
        return userMapper.findUser();
    }


    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
        int i = 1/0;
    }

    @Override
    public void updateUser(int id) {
        userMapper.updateUser(id);
    }

    @Override
    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }


}

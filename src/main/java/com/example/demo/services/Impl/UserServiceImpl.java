package com.example.demo.services.Impl;/**
 * Created by Administrator on 2017-10-30 0030.
 */

import com.example.demo.mapper.UserMapper;
import com.example.demo.domain.Users;
import com.example.demo.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author
 * @create 2017-10-30 14:05
 **/
@Component
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Users getUsers(String username) {
        Users user= userMapper.getUserByName(username);
        return user;
    }

    @Override
    public List<Users> getAllUsers() {
        List userList = userMapper.getAllUsers();
        return userList;
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    @Override
    public int addUser(Users users) {
        userMapper.addUser(users);
        return 1;
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    @Override
    public String updateUser(Users users) {
        userMapper.updateUser(users);
        return "ok";
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    @Override
    public int deleteUser(int id) {
        userMapper.deleteUser(id);
        return 1;
    }
}

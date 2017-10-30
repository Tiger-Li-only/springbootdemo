package com.example.demo.services;

import com.example.demo.domain.Users;

import java.util.List;

/**
 * Created by Administrator on 2017-10-30 0030.
 */
public interface IUserService {
    public Users getUsers(String username);

    public List<Users> getAllUsers();

    public int addUser(Users users);

    public String updateUser(Users users);

    public int deleteUser(int id);
}

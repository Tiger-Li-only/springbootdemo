package com.example.demo.controllers;
/**
 * Created by Administrator on 2017-10-30 0030.
 */

import com.example.demo.domain.Users;
import com.example.demo.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author
 * @create 2017-10-30 14:09
 **/
@Controller
@SpringBootApplication
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public Users getUserById(ModelMap modelMap, @RequestParam String username){
        Users user = userService.getUsers(username);
        modelMap.put("user",user);
        return user;
    }

    @RequestMapping("/getAllUsers")
    @ResponseBody
    public List getAllUsers(ModelMap modelMap) {
        List userList = userService.getAllUsers();
        modelMap.put("userList", userList);
        return userList;
    }
    @RequestMapping("/add")
    @ResponseBody
    public String addUser(){
        for (int i=0;i<10;i++){
            Users users = new Users();
            users.setAge(10+i);
            users.setPassword("123"+i);
            users.setUsername("张三"+i);
            userService.addUser(users);
        }
       return "添加成功!";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String updateUser(@RequestParam int id){
        Users users = new Users();
        users.setId(id);
        users.setUsername("李思");
        users.setPassword("1222");
        users.setAge(44);
        userService.updateUser(users);
        return "修改成功!";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteUser(@RequestParam int id){
        userService.deleteUser(id);
        return "删除成功!";
    }

}

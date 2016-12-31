package com.langtai.service;

import com.langtai.dao.UserDao;
import com.langtai.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wang on 16-12-30.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean checkUser(User user){
        User admin = userDao.getUserByUsername(user.getUserName());
        if(admin == null){
            return false;
        }
        else if(!admin.getPassword().equals(user.getPassword())){
            return false;
        }
        return true;
    }

    public List<User> getAllUser(){
        return userDao.getAllUser();
    }
}

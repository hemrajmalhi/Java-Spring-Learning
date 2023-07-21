package com.spring.service;
import com.spring.dao.UserDao;
import com.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public int createUser(User user){
        System.out.println(user);
        return this.userDao.savaUser(user);
    }

}

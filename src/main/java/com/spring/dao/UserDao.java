package com.spring.dao;

import com.spring.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class  UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public int savaUser(User user){
        int id =(Integer) this.hibernateTemplate.save(user);
        return id;

    }


}

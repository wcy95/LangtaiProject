package com.langtai.dao;

import com.langtai.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wang on 16-12-30.
 */
@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public User getUserByUsername(String username){
        String queryString = " from User u where u.username = ?";
        Session session = sessionFactory.getCurrentSession();
        Query<User> query = session.createQuery(queryString);
        query.setParameter(0,username);
        return query.list().get(0);
    }

    public List<User> getAllUser(){
        String queryString = "from User";
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery(queryString).list();
    }
}

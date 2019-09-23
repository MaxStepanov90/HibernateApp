package services;

import Dao.UserDao;
import models.Auto;
import models.User;

import java.util.List;

public class UserService {

    private UserDao userDao = new UserDao();

    public UserService(){
    }
    public User findUser(int id){
        return userDao.findByid(id);
    }
    public void saveUser(User user){
        userDao.save(user);
    }
    public void deleteUser (User user){
        userDao.delete(user);
    }
    public void updateUser(User user){
        userDao.update(user);
    }
    public List<User> findAllUsers(){
        return userDao.findAll();
    }
    public Auto findAutoById(int id){
        return userDao.findAutoById(id);
    }

}

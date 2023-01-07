package nuc.edu.cai4.mvctest.dao;

import nuc.edu.cai4.mvctest.entity.User;


import java.util.List;
import java.util.Map;

public interface IUserDao {
    public User findUserById(Integer id);
    public User findUserByNn(String userName,String note);
    public Boolean insertUser(User user);
    public List<User> findAllUser();
    public List<User> findAllUser(User user);
}

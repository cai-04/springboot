package nuc.edu.cai4.mvctest.service;


import nuc.edu.cai4.mvctest.entity.User;

import java.util.List;
import java.util.Map;

public interface IUserService {
    public boolean insertUser(User user);
    public User showUserById(Integer id);
    public User showUserByNn(String userName,String note);
    public List<User> showUserAll();
    public List<User> showUserAll(User user);
}

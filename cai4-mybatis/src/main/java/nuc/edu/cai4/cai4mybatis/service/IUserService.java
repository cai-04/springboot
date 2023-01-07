package nuc.edu.cai4.cai4mybatis.service;

import nuc.edu.cai4.cai4mybatis.domain.User;

import java.util.List;

public interface IUserService {
    public User getUser(Integer id);
    public List<User> findAllUser();
    public List<User> findUsers(String user_name, String sex);
    public Integer insertUser(User user);
    public Integer deleteUser(Integer id);
    public Integer updateUser(User user);
}
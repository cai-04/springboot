package nuc.edu.cai4.cai4mybatis.service.impl;

import nuc.edu.cai4.cai4mybatis.domain.User;
import nuc.edu.cai4.cai4mybatis.mapper.IUserDao;
import nuc.edu.cai4.cai4mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userdao;
    @Override
    public User getUser(Integer id) {
        return userdao.getUser(id);
    }

    @Override
    public List<User> findAllUser() {
        return userdao.findAllUser();
    }

    @Override
    public List<User> findUsers(String user_name, String sex) {
        return userdao.findUsers(user_name, sex);
    }

    @Override
    public Integer insertUser(User user) {
        return userdao.insertUser(user);

    }

    @Override
    public Integer deleteUser(Integer id) {
        return userdao.deleteUser(id);
    }



    @Override
    public Integer updateUser(User user) {
        return userdao.updateUser(user);
    }


}

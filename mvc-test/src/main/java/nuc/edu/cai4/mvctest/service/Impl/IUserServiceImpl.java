package nuc.edu.cai4.mvctest.service.Impl;

import nuc.edu.cai4.mvctest.dao.IUserDao;
import nuc.edu.cai4.mvctest.entity.User;
import nuc.edu.cai4.mvctest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class IUserServiceImpl implements IUserService {
@Autowired
    private IUserDao IUserDao ;
    List<User> users = new ArrayList<User>();
    @Override
    public boolean insertUser(User user) {
        Boolean flag=false;
        System.out.println(user.getId()+">>"+ user.getUserName()+">>"+ user.getNote());
        //System.out.println(user.getUserName()+">>"+user.getNote());
        flag= IUserDao.insertUser(user);
        return flag;
    }

    @Override
    public User showUserById(Integer id) {
        return IUserDao.findUserById(id);
    }

    @Override
    public User showUserByNn(String userName,String note) {
        return IUserDao.findUserByNn(userName,note);
    }

    @Override
    public List<User> showUserAll() {
        return IUserDao.findAllUser();
    }

    @Override
    public List<User> showUserAll(User user) {
        return IUserDao.findAllUser(user);
    }
}

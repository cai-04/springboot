package nuc.edu.cai4.mvctest.dao.Impl;

import nuc.edu.cai4.mvctest.dao.IUserDao;
import nuc.edu.cai4.mvctest.entity.Student;
import nuc.edu.cai4.mvctest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class IUserDaoImpl implements IUserDao {
    List<User> users = new ArrayList<User>();

    public IUserDaoImpl() {
        super();
        users.add(new User(1, "user_name_1", "note_1"));
        users.add(new User(2, "user_name_2", "note_2"));
        users.add(new User(3, "user_name_3", "note_3"));
    }
    @Override
    public User findUserById(Integer id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
//此处注意判空方法，按上面写会返回null报错
    @Override
    public User findUserByNn(String userName,String note) {
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getNote().equals(note)) {
                return user;
            }
        }
        return null;
    }


    @Override
    public Boolean insertUser(User user) {
        Boolean flag=false;
        System.out.println(user.getId()+">>"+ user.getUserName()+">>"+ user.getNote());
        //System.out.println(user.getUserName()+">>"+user.getNote());
        users.add(user);
        flag=true;
        return flag;
    }

    @Override
    public List<User> findAllUser() {
        return users;
    }

    @Override
    public List<User> findAllUser(User user) {
        return users;
    }
}

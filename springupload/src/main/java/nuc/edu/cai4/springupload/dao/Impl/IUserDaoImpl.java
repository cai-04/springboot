package nuc.edu.cai4.springupload.dao.Impl;

import nuc.edu.cai4.springupload.dao.IUserDao;
import nuc.edu.cai4.springupload.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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
    public User getUserById(Integer id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}

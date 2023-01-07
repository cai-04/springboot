package nuc.edu.cai4.springupload.service.Impl;


import nuc.edu.cai4.springupload.service.IUserService;
import nuc.edu.cai4.springupload.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {
@Autowired
    private nuc.edu.cai4.springupload.dao.IUserDao IUserDao ;
    List<User> users = new ArrayList<User>();


    @Override
    public User getUserById(Integer id) {
        return IUserDao.getUserById(id);
    }
}

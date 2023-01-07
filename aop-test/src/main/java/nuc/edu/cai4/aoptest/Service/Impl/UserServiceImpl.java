package nuc.edu.cai4.aoptest.Service.Impl;

import nuc.edu.cai4.aoptest.Entity.User;
import nuc.edu.cai4.aoptest.Service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    //之前执行一段代码
    @Override
    public void printUser(User user) {

        if(user==null){
            throw new RuntimeException("用户不能为空！");
        }
        System.out.println("用户id:"+user.getId());
        System.out.println("用户姓名："+user.getName());
    }
    //之后执行一段代码
    public void say() {

    }
}

package nuc.edu.cai4.aoptest.validator;

import nuc.edu.cai4.aoptest.Entity.User;


public interface UserValidator {
    //检测用户对象是否为空
    public boolean validate (User user);
}

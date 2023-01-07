package nuc.edu.cai4.aoptest.validator.impl;

import nuc.edu.cai4.aoptest.Entity.User;
import nuc.edu.cai4.aoptest.validator.UserValidator;


public class UserValidatorImpl implements UserValidator {
    @Override
    public boolean validate(User user) {
        System.out.println("引入新的接口："+UserValidator.class.getSimpleName());
        return user!=null;
    }
}

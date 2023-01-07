package nuc.edu.cai4.ioc.dao.impl;

import nuc.edu.cai4.ioc.dao.IUserDao;


public class IUserDaoImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("调用持久层DAO");
    }

    public IUserDaoImpl() {
        System.out.println("dao实现类");
    }
}

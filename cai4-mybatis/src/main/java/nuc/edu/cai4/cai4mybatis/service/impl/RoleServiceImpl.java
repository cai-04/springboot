package nuc.edu.cai4.cai4mybatis.service.impl;

import nuc.edu.cai4.cai4mybatis.domain.Role;
import nuc.edu.cai4.cai4mybatis.mapper.IRoleDao;
import nuc.edu.cai4.cai4mybatis.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleDao roleDao;

    @Override
    public Role findById(Integer id) {
        return roleDao.findById(id);
    }
}


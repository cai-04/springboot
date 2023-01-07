package nuc.edu.cai4.cai4mybatis.service.impl;

import nuc.edu.cai4.cai4mybatis.domain.Dept;
import nuc.edu.cai4.cai4mybatis.mapper.IDeptDao;
import nuc.edu.cai4.cai4mybatis.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private IDeptDao deptDao;
    @Override
    public Dept findByDeptno(Integer deptno) {
        return deptDao.findByDeptno(deptno);
    }
}

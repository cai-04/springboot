package nuc.edu.cai4.cai4mybatis.service.impl;

import nuc.edu.cai4.cai4mybatis.domain.Emp;
import nuc.edu.cai4.cai4mybatis.mapper.IEmpDao;
import nuc.edu.cai4.cai4mybatis.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private IEmpDao empDao;
    @Override
    public List<Emp> findByEmpno(Integer empno) {

        return empDao.findByEmpno(empno);
    }
    @Override
    public List<Emp>findByDeptno(Integer deptno) {

        return empDao.findByDeptno(deptno);
    }
}

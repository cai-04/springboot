package nuc.edu.cai4.cai4mybatis.service;

import nuc.edu.cai4.cai4mybatis.domain.Emp;

import java.util.List;

public interface IEmpService {
    public List<Emp> findByEmpno(Integer empno);
    public List<Emp>findByDeptno(Integer deptno);
}

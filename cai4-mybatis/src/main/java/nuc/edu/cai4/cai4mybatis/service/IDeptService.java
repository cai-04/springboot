package nuc.edu.cai4.cai4mybatis.service;

import nuc.edu.cai4.cai4mybatis.domain.Dept;

public interface IDeptService {
    public Dept findByDeptno(Integer deptno);
}

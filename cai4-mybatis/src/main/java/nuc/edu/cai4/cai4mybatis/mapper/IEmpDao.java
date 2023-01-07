package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IEmpDao {
    public List<Emp> findByEmpno(Integer empno);
    public List<Emp>findByDeptno(Integer deptno);
}

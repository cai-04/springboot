package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.Dept;
import nuc.edu.cai4.cai4mybatis.domain.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface EmpMapper {
    //根据部门编号查询所有员工
    @Select("select * from emp where deptno=#{deptno}")
    List<Emp> findEmpByDeptno(Integer deptno);
//根据员工编号获取员工信息
    @Select("select * from emp where empno=#{empno}")
    @Results({
            @Result(column="deptno",property="deptno",
                    one=@One(select="nuc.edu.cai4.cai4mybatis.mapper.DeptMapper.findDeptByDeptno"))})
                    Emp findEmpByEmpno(Integer empno);
                    @Select("select * from dept where deptno=#{deptno}")
                    Dept findDeptByDeptno(Integer deptno);
}


package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.Dept;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DeptMapper {
    @Select("select * from dept where deptno=#{deptno}")
    @Results({
            @Result(id=true,column="deptno",property="deptno"),
            @Result(column="dname",property="dname"),
            @Result(column="deptno",property="deptno"),
            @Result(column="loc",property="loc"),
            @Result(property="emps",column="deptno",
                    many=@Many(select="nuc.edu.cai4.cai4mybatis.mapper.EmpMapper.findEmpByEmpno"))})
                    Dept findDeptByDeptno(Integer deptno);
}


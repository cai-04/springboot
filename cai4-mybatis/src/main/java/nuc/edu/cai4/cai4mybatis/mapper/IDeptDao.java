package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IDeptDao {
    public Dept findByDeptno(Integer deptno);
}

package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IClassesDao {
    Classes getClass(Integer id) ; //嵌套结果
    Classes getClass2(Integer id) ; //嵌套查询
}

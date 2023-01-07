package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface TeacherMapper {
    @Select("select * from teacher where t_id=#{id}")
    @Results(id="teacherResult",value= {
            @Result(id=true,property="id",column="t_id"),
            @Result(property="name",column="t_name"),

    })
    Teacher findTeacherById(Integer id);
}


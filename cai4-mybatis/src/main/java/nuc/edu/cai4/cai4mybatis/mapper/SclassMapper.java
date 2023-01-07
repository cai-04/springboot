package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.Classes;
import org.apache.ibatis.annotations.*;

@Mapper
public interface SclassMapper {
        @Select("select * from class where c_id=#{id}")
        @Results(id="classResult",value= {
                @Result(id=true,property="id",column="c_id"),
                @Result(property="name",column="c_name"),
                @Result(property="teacher",column="teacher_id",

                        one=@One(select="nuc.edu.cai4.cai4mybatis.mapper.TeacherMapper.findTeacherById")),})
                        //根据id查询班级信息
                        Classes findClassById(Integer id);
    }


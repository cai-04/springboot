package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStudentDao {
    public Student findById(Integer id);
}

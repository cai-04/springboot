package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.Role;
import nuc.edu.cai4.cai4mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentRoleDao {
    public List<User> getStusByRoleId(Integer roleId);
    public List<Role> getRolesByStuId(Integer stuId);
}

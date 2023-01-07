package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.Role;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IRoleDao {
    public Role findById(Integer id);
}

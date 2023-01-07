package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface IUserDao {
    //@Select("select  * from  user")
    List<User> findAll();
    //boolean insertUser(User user);
    //User getUserbyNameandSex();
    //User getUserOrders();
    User getUser(Integer id);
    List<User> findAllUser();
    List<User> findUsers(
            @Param("user_name") String user_name,
            @Param("sex") String sex);

    Integer insertUser(User user);
    Integer deleteUser(Integer id);

    Integer updateUser(User user);
}

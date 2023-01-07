package nuc.edu.cai4.cai4mybatis.mapper;

import nuc.edu.cai4.cai4mybatis.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserInfoMapper {
    @Select("select * from t_user")
    //@Results用于映射对象属性和数据库列，常用于对象属性和数据库列不同名情况
    @Results(id="userResult",value={
            @Result(id=true,column="id",property="id"),
            @Result(column="user_name",property="userName"),
            @Result(column="note",property="note"),
    })
    public List<User> findAllUser();
    @Select("select * from t_user where id=#{id}")
    //引用id=“userResult”的Results
    @ResultMap("userResult")
    public User getUser(Integer id);
    @Select("select * from t_user "
            + "where user_name like concat('%',#{userName},'%') "
            + "and note like concat('%',#{note},'%')")
    //引用id=“userResult”的Results

    @ResultMap("userResult")
    List<User> findAllUser1(String userName,String note);
    @Insert("insert into t_user(user_name,note) values(#{userName},#{note})")
    @Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
    Integer insertUser(User user);
    @Update("update t_user set user_name=#{userName},note=#{note} where id=#{id}")
            Integer updateUser(User user);
            @Delete("delete from t_user where id=#{id}")
            Integer deleteUser(Integer id);
}


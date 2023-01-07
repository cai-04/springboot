package nuc.edu.cai4.cai4mybatis;

import nuc.edu.cai4.cai4mybatis.domain.User;
import nuc.edu.cai4.cai4mybatis.mapper.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
class Cai4MybatisApplicationTests {
 /*   @Autowired
    DataSource dataSource;

    @Autowired
    IUserDao userDao;

    @Test
    void contextLoads() {
    }
    @Test
    public void testFindAll() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("static/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> userList = sqlSession.selectList("nuc.edu.cai4.cai4mybatis.mapper.IUserDao.findAll");
        System.out.println(userList);
    }

    @Test
    public void testinsertUser() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("static/mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        User user = new User();
        user.setUser_name("cai4");
        //user.setBirthday("2001-03-08");
        user.setSex("1");
        user.setAddress("山西太原");
        userDao.insertUser(user);
        sqlSession.commit();
    }

    @Test
    public void testdataSource(){
        //System.out.println(dataSource);
        List<User> all = userDao.findAll();
        System.out.println(all);
    }*/

    @Autowired
    IUserDao userDao;
    @Test
    public void testFindAll(){
        List<User> all = userDao.findAll();
        System.out.println(all);
    }

    @Test
    public void testinsert() {
        User user = new User();
        user.setUser_name("caicai");
        user.setAddress("heilongjiang");
        userDao.insertUser(user);
        System.out.println(user);
    }
}

package com.xie.test;

import com.xie.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void test1() throws IOException {
//     //获得配置核心文件
//        InputStream inputstream = Resources.getResourceAsStream("userMapConfig.xml");
//        //获得session工厂对象
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputstream);
//        //获得Session会话对象
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //执行操作
//        List<User> user = sqlSession.selectList("xdn.findAll");
//        System.out.println(user);
//        sqlSession.close();
        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("userMapConfig.xml");
//获得sqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//获得sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//执行sql语句
        List<User> userList = sqlSession.selectList("select1");
//打印结果
        System.out.println(userList);
//释放资源
        sqlSession.close();

    }
}

package com.xie.domain;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class tese {
    public static void main(String[] args) throws Exception{
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

package com.wusuiwei.mybatis.helloworld2;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * mybatis helloworld
 *
 * @author SUIWEI WU
 * @date 2021/7/13 18:18
 */
public class HelloWorld {
    public static void main(String[] args) throws IOException {
        System.out.println(Resources.getResourceAsFile("/").getAbsolutePath());
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectOne(1);
        System.out.println(employee);
        sqlSession.close();
    }
}

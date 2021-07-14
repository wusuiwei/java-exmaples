package com.wusuiwei.mybatis.crud.dao;

import com.wusuiwei.mybatis.crud.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author SUIWEI WU
 * @date 2021/7/14 10:34
 */
class EmployeeMapperTest {
    private static SqlSession sqlSession;

    @BeforeAll
    public static void beforeAll() {
        String recource = "mybatis-config.xml";
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream(recource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void addEmployee() {
        try {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee();
            employee.setLastName("tom");
            employee.setEmail("tom@gmail.com");
            employee.setGender("1");
            int i = employeeMapper.addEmployee(employee);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    void updateEmployee() {
        try {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee();
            employee.setId(1);
            employee.setLastName("jackson");
            employee.setEmail("jackson@gmail.com");
            employee.setGender("0");
            employeeMapper.updateEmployee(employee);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    void getEmployeeById() {
        try {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployeeById(1);
            System.out.println(employee);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    void getEmployeeList() {
        try {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            List<Employee> employeeList = employeeMapper.getEmployeeList();
            System.out.println(employeeList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    void deleteEmployee() {
        try {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            int i = employeeMapper.deleteEmployee(1);
            if (i != 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
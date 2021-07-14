package com.wusuiwei.mybatis.crud.dao;

import com.wusuiwei.mybatis.crud.pojo.Employee;

import java.util.List;

/**
 * 员工mapper
 *
 * @author SUIWEI WU
 * @date 2021/7/14 10:08
 */
public interface EmployeeMapper {
    /**
     * 根据ID查询员工
     * @param id
     * @return
     */
    Employee getEmployeeById(Integer id);

    /**
     * 获取全部员工
     * @return
     */
    List<Employee> getEmployeeList();

    /**
     * 新增员工
     * @param employee
     * @return
     */
    int addEmployee(Employee employee);

    /**
     * 修改员工
     * @param employee
     * @return
     */
    int updateEmployee(Employee employee);

    /**
     * 删除员工
     * @param id
     * @return
     */
    int deleteEmployee(int id);
}

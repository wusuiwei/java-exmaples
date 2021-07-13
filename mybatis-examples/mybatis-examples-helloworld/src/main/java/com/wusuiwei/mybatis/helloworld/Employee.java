package com.wusuiwei.mybatis.helloworld;

import lombok.Data;

/**
 * employee
 *
 * @author SUIWEI WU
 * @date 2021/7/13 19:19
 */
@Data
public class Employee {
    private int id;
    private String lastName;
    private String email;
    private String gender;
}

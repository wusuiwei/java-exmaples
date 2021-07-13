package com.wusuiwei.java8.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        //1.创建 EntityManagerFactory
        String persistenctUnitName = "datasource";
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenctUnitName);

        //2.创建 EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //3.开启事务
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        //4.进行持久化操作
        Customer customer = new Customer();
        customer.setLastName("jack");
        customer.setAge(12);
        customer.setEmail("jack@163.com");
        entityManager.persist(customer);

        //5.提交事务
        transaction.commit();

        //6.关闭 EntityManager
        entityManager.close();

        //7.关闭 EntityManagerFactory
        entityManagerFactory.close();

    }
}

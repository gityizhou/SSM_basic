package com.zhouyi.test;

import com.zhouyi.dao.AccountDao;
import com.zhouyi.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void run() throws Exception {
        // 加载mybatis配置文件
        InputStream in = Resources.getResourceAsStream("applicationContext.xml");
        // 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> list = dao.findAll();
        list.forEach(System.out::println);
        session.close();
        in.close();


    }

    @Test
    public void run2() throws Exception {
        // 加载mybatis配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("周三");
        account.setMoney(400d);
        dao.saveAccount(account);
        session.commit();
        session.close();
        in.close();


    }
}

package com.zhouyi.test;

import com.zhouyi.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void run1(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountService as = (AccountService) ac.getBean("accountService");

        as.findAll();

    }
}

package com.intelematics.architecture.typesafe.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBeanLoggerTest
{
    @Autowired
    private ApplicationContext context;

    @Test
    public void logAllLoadedBeans()
    {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("=================");
        System.out.println(beanDefinitionNames.length);
        System.out.println("=================");
        for (String name : beanDefinitionNames)
        {
            System.out.println(name);
        }
    }
}
